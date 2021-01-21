package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/queryTest2")
public class QueryTest2Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query String Test</title></head>");
		out.print("<body>");
		out.print("<h1>POST Query String 추출</h1>");
		ServletInputStream input = req.getInputStream(); // request 몸체와 연결된 입력스트림 생성
		int len = req.getContentLength(); // request 몸체 문자열 길이 반환
		byte[] buf = new byte[len]; // 바이트 메모리 생성
		input.readLine(buf, 0, len); // buf 바이트 메모리에 첫번째부터 len길이만큼 저장
		String s = new String(buf);
		out.print("전체 문자열 : " + s);
		out.print("</body></html>");
		out.close();
	}
}
