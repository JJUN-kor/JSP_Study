<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%
		int total = out.getBufferSize();
		out.print("First Text");
		out.clearBuffer(); //버퍼 내용 삭제
		out.print("Output Buffer Size : " + total);
		out.print("<br>Reamain Buffer Size : " + out.getRemaining()); // 남은 버퍼 사이즈
		out.flush(); //버퍼 내용 강제 출력
		out.print("<br> After Flush Buffer Size: " + out.getRemaining()); //flush 이후 남은 버퍼 `사이즈
	%>
	
	<hr>
	
	<%
		out.print(100);
		out.print(true);
		out.print(3.14);
		out.print("TEST");
		out.print('가');
		out.print(new java.io.File("\\"));
		
		out.print("Buffer Size :" + out.getRemaining());
	%>

</body>
</html>