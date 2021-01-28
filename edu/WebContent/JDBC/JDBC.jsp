<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<%
		
		try{
			//DriverManager Loading
			Class.forName("com.mysql.jdbc.Driver");
			//out.print("Class Not Found");

		
			//DB URL
			String url = "jdbc:mysql://localhost:3306/AHDB";
			String id = "root";
			String pwd = "ekzmekzm1!";
			Connection conn = DriverManager.getConnection(url, id ,pwd);
		
			//Statement
			Statement stmt = conn.createStatement();
			//PreparedStatement
			PreparedStatement pstmt = conn.prepareStatement("intsert into auction values(?,?,?,?)");
			pstmt.setString(1, "1");
			pstmt.setString(2, "1");
			pstmt.setString(3, "1");
			pstmt.setString(4, "1");
			
			//ResultSet
			ResultSet rs = stmt.executeQuery("select * from auction");
		
			while(rs.next()){
				out.println(rs.getString("item_name") + "<br>");
				
			}
		}
	
		catch(Exception e){
			out.print("예외 발생");
			e.getMessage();
			
		}
	
		out.print("<h1> DB 연결 성공 </h1>");
		
		
	
	%>

</body>
</html>