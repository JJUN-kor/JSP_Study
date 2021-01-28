package com.edu.test;

import javax.servlet.*;

public class TestRequestListener implements ServletRequestListener{
	//생성자
	public TestRequestListener(){
		System.out.println("TestRequestListener 생성");
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("HttpServletRequest 객체 초기화");
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("HttpServletRequest 객체 해제");
	}
}
