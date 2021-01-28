package com.edu.test;

import java.io.IOException;

import javax.servlet.*;

public class FlowFilterOne implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() 호출__ one");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("doFilter() 호출 전 __ one"); //Servlet 실행 전
		chain.doFilter(request, response); //service method 실행
		System.out.println("doFilter() 호출 후 __ one"); //Servlet 실행 후
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy()__호출 one");
	}
}
