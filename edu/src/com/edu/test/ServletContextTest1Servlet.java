package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/context1")
public class ServletContextTest1Servlet extends HttpServlet{
	
	//case2: HttpServlet을 통해 추출
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		ServletContext sc = this.getServletContext();
		String location = sc.getInitParameter("contextConfig");
		out.println("Context : " + sc + "<br/>"); // 객체의 ID출력
		out.println("location : " + location);
		out.close();
	}
}
