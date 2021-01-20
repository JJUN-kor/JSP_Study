package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request URL Info</title></head>");
		out.print("<body>");
		out.print("<h3>Request URL Info</h3>");
		out.print("Request URI : " + req.getRequestURI() + "<br/>");
		out.print("Request URL : " + req.getRequestURL() + "<br/>");
		out.print("Context Path : " + req.getContextPath() + "<br/>");
		out.print("Request Protocol : " + req.getProtocol() + "<br/>");
		out.print("Servlet Path : " + req.getServletPath() + "<br/>");
		out.print("</body></html>");
		out.close();
	}
}
