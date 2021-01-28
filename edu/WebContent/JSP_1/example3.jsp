<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exception</title>
</head>
<body>
	<h4>다음과 같은 에러가 발생</h4>
	ErrorType : <%=exception.getClass().getName()%>
	<br> ErrorMessage: <%= exception.getMessage() %>
</body>
</html>