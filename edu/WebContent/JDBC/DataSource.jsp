<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>    
<%@ page import = "javax.sql.*" %>
<%@ page import = "javax.naming.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

<%

	//(1) JDNI
	InitialContext ic = new InitialContext();
	//(2) lookup()
	DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/mysql");
	//(3) getConnection()
	Connection conn = ds.getConnection();
	
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from auction");
	
	while (rs.next()){
		out.print(rs.getString("item_name") + "<br>");
	}
	


%>

</body>
</html>