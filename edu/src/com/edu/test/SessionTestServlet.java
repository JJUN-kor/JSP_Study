package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/sessionTest")
public class SessionTestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();

		String param = req.getParameter("p");
		String msg = null;
		HttpSession session = null;
		
		//getSession(boolean create)  true -> HttpSession 객체 return / false -> null return
		if (param.equals("create")) 
		{
			session = req.getSession();
			if (session.isNew())
				msg = "새로운 세션 객체 생성";
			else
				msg = "기존의 세션 객체 리턴";
		} 
		else if (param.equals("delete")) 
		{
			session = req.getSession(false);
			if (session != null) 
			{
				session.invalidate(); // 세션 소멸
				msg = "세션 객체 삭제 완료";
			} 
			else 
			{
				msg = "삭제할 세션 없음";
			}
		}
		else if (param.equals("add")) {
				session = req.getSession(true);
				session.setAttribute("msg", "Message");
				msg= "세션 객체에 데이터 등록 완료";
				
			}
		else if (param.equals("get")) {
			session = req.getSession(false);
			if (session != null) {
				String str = (String) session.getAttribute("msg");
				msg= str;
			}
			else {
				msg = "데이터를 추출할 세션 객체 존재 없음";
			}

		}
		
		else if (param.equals("remove")) {
			session = req.getSession(false);
			if (session != null) {
				session.removeAttribute("msg");
				msg = "세션 객체의 데이터 삭제 완료";
			}
			else {
				msg = "데이터를 삭제할 세션 객체 존재 없음";
			}

		}
		
		else if (param.equals("replace")) {
			session = req.getSession();
			session.setAttribute("msg", "New Msg");

		}
		
		out.print("처리 결과 : " + msg);
		
		out.close();

	}
}
