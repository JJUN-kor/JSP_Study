<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Method</title>
</head>
<body>
	<h3> 선언문 함수 구현</h3>
	
	<%!
		public int sum(int a, int b){
			return a+b;
		}
	%>
	
	sum(20,30) 호출 값 : <%= sum(20,30) %>
</body>
</html>