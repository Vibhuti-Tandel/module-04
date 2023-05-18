<%@page import="dao.UserDaoP6"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P6 Register</title>
</head>
<body>
<jsp:useBean id="u" class="model.UserP6"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
	UserDaoP6.insertUser(u);
	response.sendRedirect("M04_P6_display.jsp");
%>
</body>
</html>