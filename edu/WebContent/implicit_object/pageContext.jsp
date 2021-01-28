<%@page import="java.io.Console"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext</title>
</head>
<body>
	<%!
		public void work(String p, PageContext pc){
			try{
				JspWriter out = pc.getOut(); // 선언문은 __jspService Block에 해당X 내장객체 선언 필요
				if(p.equals("include")){
					out.print("===Before Include=== <br>");
					pc.include("test.jsp");
					out.print("===After Include=== <br>");
					
				}
				else if (p.equals("forward")){
					pc.forward("test.jsp");
				}
			}
			catch (Exception e){
				e.getStackTrace();
			}
		}
	%>
	
	<%
		String p = request.getParameter("p");
		work(p, pageContext);
		
	%>
</body>
</html>