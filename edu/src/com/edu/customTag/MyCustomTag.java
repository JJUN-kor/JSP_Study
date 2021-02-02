package com.edu.customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;


public class MyCustomTag extends BodyTagSupport{
	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("Start Tag");
		return super.doStartTag();
	}
	
	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("Body Tag");
		return super.doAfterBody();
	}
	
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("End Tag");
		return super.doEndTag();
	}
}
