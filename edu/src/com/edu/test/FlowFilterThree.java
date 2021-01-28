package com.edu.test;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="timer", urlPatterns = "/third")
public class FlowFilterThree implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		chain.doFilter(request, response);
		long endTime = System.currentTimeMillis();
		
		long executeTime = endTime - startTime;
		System.out.println("Execute Time : " + executeTime + "ms");
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
