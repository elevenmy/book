package com.library.DAO;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.library.bean.Book;


public class BookDAO {
	private DataSource ds =null;
	private Connection conn=null;
	public List<Book> findByPage(int currentNum, int currentPage) throws Exception {
		String sql = "select * from library limit ?,?";
		List<Book> list =new ArrayList<>();
		Properties p = new Properties();
		p.load(new FileInputStream(BookDAO.class.getResource("/").getPath()+"druid.properties"));
		ds=DruidDataSourceFactory.createDataSource(p);
		conn=ds.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,(( currentNum-1)*currentPage));
		ps.setInt(2, currentPage);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			list.add(new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getDouble(5),rs.getInt(6),rs.getString(7)));
		}
		rs.close();
		ps.close();
		conn.close();
		return list;
	}
	
	public int findCount() throws Exception { 
		String sql = "select count(*) from library";
		Properties p = new Properties();
		p.load(new FileInputStream(BookDAO.class.getResource("/").getPath()+"druid.properties"));
		ds=DruidDataSourceFactory.createDataSource(p);
		conn=ds.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		int count=11;
		while(rs.next()){
			count=rs.getInt(1);
		}
		rs.close();
		ps.close();
		conn.close();
		return count;
	}
	public List<Book> select() throws Exception{
		List<Book> list =new ArrayList<>();
		Properties p = new Properties();
		p.load(new FileInputStream(BookDAO.class.getResource("/").getPath()+"druid.properties"));
		ds=DruidDataSourceFactory.createDataSource(p);
		conn=ds.getConnection();
		String sql="select * from library";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			list.add(new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getDouble(5),rs.getInt(6),rs.getString(7)));
		}
		rs.close();
		ps.close();
		conn.close();
		return list;
	}
	public Book select1(int no) throws Exception{
		Book book=null;
		Properties p = new Properties();
		p.load(new FileInputStream(BookDAO.class.getResource("/").getPath()+"druid.properties"));
		ds=DruidDataSourceFactory.createDataSource(p);
		conn=ds.getConnection();
		String sql="select * from library where no=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, no);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			book=new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getDouble(5),rs.getInt(6),rs.getString(7));
		}
		rs.close();
		ps.close();
		conn.close();
		return book;
	}
	public void insert(Book book) throws Exception{
		Properties p = new Properties();
		p.load(new FileInputStream(BookDAO.class.getResource("/").getPath()+"druid.properties"));
		ds=DruidDataSourceFactory.createDataSource(p);
		conn=ds.getConnection();
		String sql="insert into library (name,author,count,price,num,play) values(?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, book.getName());
		ps.setString(2, book.getAuthor());
		ps.setDouble(3, book.getCount());
		ps.setDouble(4, book.getPrice());
		ps.setInt(5, book.getNum());
		ps.setString(6, book.getPlay());
		ps.executeUpdate();
		
		ps.close();
		conn.close();
	}
	public void delete(int no) throws Exception{
		Properties p = new Properties();
		p.load(new FileInputStream(BookDAO.class.getResource("/").getPath()+"druid.properties"));
		ds=DruidDataSourceFactory.createDataSource(p);
		conn=ds.getConnection();
		conn=ds.getConnection();
		String sql="delete from library where no=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,no);
		ps.executeUpdate();
		
		ps.close();
		conn.close();
	}
	
}
