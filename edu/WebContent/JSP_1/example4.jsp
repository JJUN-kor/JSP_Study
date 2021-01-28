<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page errorPage="example3.jsp" %>

<%
	String param = request.getParameter("id");
	if (param.equals("test"))
		param = "Parameter 입력 (예외 발생 X)";
%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%= param %>

</body>
</html>