package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/context1")
public class ServletContextTest1Servlet extends HttpServlet{
	
	ServletContext sc; // ServletContext 참조변수 
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		sc = config.getServletContext(); // ServletConfig 객체의 getServletContext() method 호출
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("Context : " + sc); // 객체의 ID출력
		out.close();
	}
}
