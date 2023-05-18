<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="dao.UserDaoP6,model.*,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P6 Display</title>
</head>
<body>
<center>
<h1>User Information</h1>

<%
	List<UserP6> list = UserDaoP6.getAllUser();
	request.setAttribute("list", list);
%>

<table border="1" width="70%">
	<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Mobile</th>
		<th>Email</th>
		<th>Password</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="u" items="${list}">
	<tr>
		<td>${u.getId()}</td>
		<td>${u.getFname() }</td>
		<td>${u.getLname() }</td>
		<td>${u.getMobile() }</td>
		<td>${u.getEmail() }</td>
		<td>${u.getPassword()}</td>
		<td><a href="M04_P6_edit_form.jsp?id=${u.getId()}">Edit</a></td>
		<td><a href="M04_P6_deleteuser.jsp?id=${u.getId()}">Delete</a></td>
	</tr>
	</c:forEach>
	</table>


</center>
</body>
</html>