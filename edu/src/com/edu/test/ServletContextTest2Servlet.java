package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/context2")
public class ServletContextTest2Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		ServletContext sc = this.getServletContext();
		
		//String location = sc.getInitParameter("contextConfig");
		
		out.print("Servlet Ver : " + sc.getMajorVersion() + " . " + sc.getMinorVersion());
		out.print("<br>Server Info : " + sc.getServerInfo());
		out.print("<br>Web App location : " + sc.getContextPath());
		out.print("<br>Web App name : " + sc.getServletContextName());
		out.print("<br>Absoulte location : " + sc.getRealPath("/name.html"));
		sc.log("Log");
		
		out.close();
	}
}
