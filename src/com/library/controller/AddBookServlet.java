package com.library.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.bean.Book;
import com.library.service.BookService;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<String> errors=new ArrayList<>();
		String name=request.getParameter("name");
		String author=request.getParameter("author");
		String count1=request.getParameter("count");
		String price1=request.getParameter("price");
		String num1=request.getParameter("num");
		String play=request.getParameter("play");
		double price=0;
		double count=0;
		int num=0;
		try{
			price=Double.parseDouble(price1);
			count=Double.parseDouble(count1);
			num=Integer.parseInt(num1);
		}catch(Exception e){
			errors.add("类型转换错误");
		}
		if("".equals(name)){
			errors.add("姓名不能为空");
		}
		if("".equals(author)){
			errors.add("作者不能为空");
		}
		if(count==0){
			errors.add("折扣不能为0");
		}
		if(price==0){
			errors.add("价格不能为0");
		}
		if(num==0){
			errors.add("数量不能为0");
		}
		if(errors.size()>0){
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("AddBookFail.jsp").forward(request, response);
		}else{
			Book book=new Book(name, author, count, price, num, play);
			BookService service=BookService.getBookService();
			service.createBook(book);
			request.setAttribute("book", book);
			request.getRequestDispatcher("addbooksuccess.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
