<%@ page import="com.edu.beans.BookBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	ArrayList<BookBean> bookList = new ArrayList<BookBean>();

	bookList.add(new BookBean("The Scret", "Byrne, Rhonda", "Atria Books"));
	bookList.add(new BookBean("The Last Lecture", "Randy Pausch", "hyperion"));
	
	String [] bookCode = {"소설", "역사", "인문", "정치", "미술", "종교", "여행", "과학", "만화", "건강"};
	
%>

<c:set var="list" value="<%=bookList %>"/>

<c:forEach items="${list}" var="item">
	${item.title} / ${item.author} / ${item.publisher} <br>
</c:forEach>

<hr>

<c:set var="code" value="<%=bookCode%>"/>

<c:forEach items="${code}" var="item">
	<c:out value="${item}"/>
</c:forEach>

<hr>

<c:forEach var="i" begin="2" end="9">
	<c:forEach var="j" begin="1" end="9">
		${i} * ${j} = ${i*j} <br>
	</c:forEach>
</c:forEach>

<hr>

<c:forEach var="k" begin="1" end="10" step="2">
	<c:out value="${k}"/>
</c:forEach>

<hr>

<c:forTokens items="A/B/C/D/E/F/G/H/I/J/K/L/M/N/O/P/Q/R/S/T/U/V/W/X/Y/Z" delims="/" var="token">
	${token}
</c:forTokens>