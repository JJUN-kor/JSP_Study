package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/bookReg")
public class BookTest1Servlert extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		req.setCharacterEncoding("utf-8");
		
		String title = req.getParameter("title");
		String author = req.getParameter("author");
		String publisher = req.getParameter("publisher");
		
		Book book = new Book();
		book.setTitle(title);
		book.setAuthor(author);
		book.setPublisher(publisher);
		
		req.setAttribute("book" , book);
		
		//ServletContext sc = this.getServletContext();
		//RequestDispatcher rd = sc.getRequestDispatcher("/bookOutput");
		RequestDispatcher rd =req.getRequestDispatcher("bookOutput");
		rd.forward(req, resp);
		
		out.close();
		
	}
}
