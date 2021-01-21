package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/member")
public class MemberTestServlet extends HttpServlet{
	String str;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int number=0;
		
		str = req.getParameter("msg");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		out.println("<html><head><title>MultiThread Test</title></head>");
		out.println("<body><h2>처리 결과(멤버변수)</h2>");
		while (number++ < 10) {
			out.print(str + " : " + number + "<br>");
			out.flush(); //버퍼 내용 출력
			System.out.println(str + " : " + number);
			
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		out.println("<h2> Done " + str + " !!</h2>");
		out.println("</body></html>");
		out.close();
	}

}
