package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class InitParamServlet extends HttpServlet {
	String id, password;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		// ( web.xml ) <init-param> 태그의 <param-name>태그의 <param-value>를 반환
		id = config.getInitParameter("id"); 
		password = config.getInitParameter("password");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h2>web.xml의 초기 추출 변수 </h2>");
		out.print("<h3> ID : " + id +"</h3>");
		out.print("<h3> Password : " + password +"</h3>");
		out.close();
	}

}
