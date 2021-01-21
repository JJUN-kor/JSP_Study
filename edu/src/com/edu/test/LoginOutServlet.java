package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/logProc")
public class LoginOutServlet extends HttpServlet {
	// 로그인 처리
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");

		if (id.isEmpty() || pwd.isEmpty()) {
			out.print("Insert your ID or Password!");
			return;
		}
		HttpSession session = req.getSession();
		if (session.isNew() || session.getAttribute("id") == null) {
			session.setAttribute("id", id);
			out.print("Log in Success");
		} else {
			out.print("Log in Already.");
		}
		out.close();
	}

	// 로그아웃 처리
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		
		if (session != null && session.getAttribute("id")!= null) {
			session.invalidate();
			out.print("Log Out Successful");
		}
		else {
			out.print("Not Log in Already");
		}
		
		out.close();
	}
}
