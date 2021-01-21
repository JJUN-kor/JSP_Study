package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/queryTest3")
public class QueryTest3Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter(); 
		out.print("<html><head><title>Query String Test</title></head>");
		out.print("<body>");
		out.print("<h1>GET 방식으로 요청됨..</h1>");
		
		
		String name = req.getParameter("name");
		out.print("이름 : " + name + "</br>");
		out.print("</body></html>");
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter(); 
		out.print("<html><head><title>Query String Test</title></head>");
		out.print("<body>");
		out.print("<h1>POST 방식으로 요청됨..</h1>");
		
		req.setCharacterEncoding("UTF-8"); //Request Query String을 UTF-8로 인코딩
		String name = req.getParameter("name");
		out.print("이름 : " + name + "</br>");
		out.print("</body></html>");
		out.close();
	}
}
