package com.library.service;

import java.util.List;

import com.library.DAO.BookDAO;
import com.library.bean.Book;
import com.library.bean.PageBean;

public class BookService {
	private static final BookService service=new BookService();
	private BookDAO dao;
	private BookService(){
		dao=new BookDAO();
	}
	
	public static BookService getBookService(){
		return service;
	}
	public List<Book> getList() throws Exception{
//		return dao.select();
		return new BookDAO().select();
//		return new DruidDAO().select();
	}
	public Book getBook(int no) throws Exception{
//		return dao.select();
		return new BookDAO().select1(no);
//		return new DruidDAO().select();
	}
	public void createBook(Book book){
			try {
				dao.insert(book);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void deleteBook(int no){
		try {
			dao.delete(no);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public PageBean findByPage(int currentNum, int currentPage) throws Exception {
		PageBean pb = new PageBean();
		List<Book> list =  dao.findByPage(currentNum,currentPage);
		int totalCount = dao.findCount();
		int totalPage = (int) Math.ceil(totalCount*1.0/currentPage);
		pb.setList(list);
		pb.setCurrentPage(currentPage);
		pb.setCurrentNum(currentNum);
		pb.setTotalCount(totalCount);
		pb.setTotalPage(totalPage);
		return pb;
	}
}
