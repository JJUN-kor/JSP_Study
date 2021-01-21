package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/portalSite")
public class SendRedirectTestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String param = req.getParameter("site");

		switch (param) {
			case "naver":
				resp.sendRedirect("http://www.naver.com");
				break;
			case "daum":
				resp.sendRedirect("http://www.daum.net");
				break;
			case "zum":
				resp.sendRedirect("http://www.zum.com");
				break;
			case "google":
				resp.sendRedirect("http://www.google.com");
				break;
		}
	}
}
