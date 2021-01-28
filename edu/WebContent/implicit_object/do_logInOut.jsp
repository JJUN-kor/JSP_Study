<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>

	<% if (request.getMethod().equals("POST")){ %>
	<%
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		//유효성 체크
		if (id.isEmpty() || pwd.isEmpty()){
			request.setAttribute("error", "Input your ID / PW"); // request외에도 session , context로 가능 
			RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp"); // foward(), include() method를 담는 객체
			rd.forward(request, response);
			return;
		}
		
		//로그인 처리
		if (session.isNew() || session.getAttribute("id") == null){
			session.setAttribute("id", id);
			out.print("Log in Success");
		}
		else{
			out.print("Log in Already");
		}
	%> <br>
	
	<%= id %> / <%= pwd %>
	<%}
		else if(request.getMethod().equals("GET")){
			if (session != null && session.getAttribute("id") != null){
				session.invalidate(); //세션 삭제
				out.print("Log Out Success");
			}
			else{
				out.print("Not Log in");
			}
		}
	%>
	
	<%
		RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp");
		rd.forward(request, response);
	%>
	

</body>
</html>