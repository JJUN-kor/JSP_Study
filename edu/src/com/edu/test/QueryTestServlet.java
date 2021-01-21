package com.edu.test;

import java.io.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] hobbies = req.getParameterValues("hobby"); // CheckBox 태그 값들 
		String sex = req.getParameter("gender");
		String religion = req.getParameter("religion");
		String intro = req.getParameter("introduction");
		
		
		
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter(); 
		out.print("<html><head><title>Query String Test</title></head>");
		out.print("<body>");
		out.print("<h1>GET 방식으로 요청됨..</h1>");
		out.print("ID: " + id + "</br>");
		out.print("PWD: " + pwd + "</br>");
		out.print("Name: " + name + "</br>");
		out.print("Hobby: ");
		for (int i=0; i<hobbies.length; i++)
			out.print(hobbies[i] + " ");
		out.print("</br>");
		out.print("Sex: " + sex + "</br>");
		out.print("Religion: " + religion + "</br>");
		out.print("Intro: " + intro + "</br>");
		out.print("Get Query String : " + req.getQueryString() );
		
		out.print("</body></html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] hobbies = req.getParameterValues("hobby"); // CheckBox 태그 값들 
		String sex = req.getParameter("gender");
		String religion = req.getParameter("religion");
		String intro = req.getParameter("introduction");
		
		
		
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter(); 
		out.print("<html><head><title>Query String Test</title></head>");
		out.print("<body>");
		out.print("<h1>POST 방식으로 요청됨..</h1>");
		out.print("ID: " + id + "</br>");
		out.print("PWD: " + pwd + "</br>");
		out.print("Name: " + name + "</br>");
		out.print("Hobby: ");
		for (int i=0; i<hobbies.length; i++)
			out.print(hobbies[i] + " ");
		out.print("</br>");
		out.print("Sex: " + sex + "</br>");
		out.print("Religion: " + religion + "</br>");
		out.print("Intro: " + intro + "</br>");
		
		out.print("</body></html>");
		out.close();
	}

}
