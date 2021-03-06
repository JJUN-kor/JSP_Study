<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.edu.beans.BookBean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="name" value="Amy"/> <br>
<c:out value="${name}"/>

<c:remove var="name"/>
<c:out value="${name}"/> <br>

<%
	BookBean book = new BookBean("The secret" , "Byrne, Rhonda" , "Atria Books");
	request.setAttribute("bookOne", book); 
%>

<c:set var="title" value="${bookOne.title}"/>
<c:out value="${title}"/> <br>

<c:set var="auhor" value="<%=book.getTitle() %>"/>
<c:out value="${author}"/> <br>


<hr>


<c:set var="name">Tobey</c:set>
<c:out value="${name}"/> <br>


<%
	BookBean book2 = new BookBean("The Last Lecture" , "Randy Pausch" , "hyperion");
	request.setAttribute("bookTwo", book); 
%>

<c:set var="title">${bookTwo.title}</c:set>
<c:out value="${title}"/> <br>

<c:set var="author"><%=book2.getAuthor() %></c:set>
<c:out value="${author}" /><br>
