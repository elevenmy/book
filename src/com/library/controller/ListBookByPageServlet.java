package com.library.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.bean.PageBean;
import com.library.service.BookService;

/**
 * Servlet implementation class ListLeagueByPageServlet
 */
@WebServlet("/ListBookByPageServlet")
public class ListBookByPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListBookByPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int currentNum = 1; 
		int currentPage = 5;
		String s_currentNum = request.getParameter("currentNum");
		String s_currentPage = request.getParameter("currentPage");
		if(s_currentNum != null)
			currentNum = Integer.parseInt(s_currentNum);
		
		if(s_currentPage != null)
			currentPage = Integer.parseInt(s_currentPage);
		
		BookService service = BookService.getBookService();
		PageBean pb;
		try {
			pb = service.findByPage(currentNum,currentPage);
			request.setAttribute("pb", pb);
			request.getRequestDispatcher("ListBookPage.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
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
