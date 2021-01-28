<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application</title>
</head>
<body>
Server Name : <%= application.getServerInfo() %> <br>
Servlet Ver : <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %>
<h3> /edu List</h3>
<%
	java.util.Set<String> list = application.getResourcePaths("/");
	if (list != null){
		Object [] obj = list.toArray();
		
		for (int i=0; i<obj.length; i++){
			out.print(obj[i] + "<br>");
		}
	}

%>
</body>
</html>