package com.edu.test;

import java.io.IOException;

import javax.servlet.*;

public class FlowFilterTwo implements Filter{
	String charset;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() 호출 __ two");
		charset = filterConfig.getInitParameter("en");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding(charset); //필터로 한글처리 코드 추가
		System.out.println("doFilter() 호출 전 __ two");
		chain.doFilter(request, response);
		System.out.println("doFilter() 호출 후 __ two");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy()__호출 two");
	}
}
