package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/bookOutput")
public class BookTest2Servlert extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		Book book = (Book)req.getAttribute("book"); //foward로 request객체를 넘겨 받았음
		
		out.print("<h3> Title : " + book.getTitle() + "</h3>");
		out.print("<h3> Author : " + book.getAuthor() + "</h3>");
		out.print("<h3> Publisher : " + book.getPublisher() + "</h3>");
		
		out.close();
		
		
	}
}
