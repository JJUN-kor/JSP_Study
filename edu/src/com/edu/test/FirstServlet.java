package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/first")
public class FirstServlet extends HttpServlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		//TODO Auto-generated method stub
		System.out.println("init()__실행");
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service()__실행");
	}
}
