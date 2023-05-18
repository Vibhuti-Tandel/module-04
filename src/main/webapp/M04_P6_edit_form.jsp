<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="dao.UserDaoP6,model.UserP6" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P6 Edit Form</title>
</head>
<body>

<%
	int id = Integer.parseInt(request.getParameter("id"));
	UserP6 u = UserDaoP6.getUserById(id);
%>

<form action="M04_P6_edit_user.jsp" method="post">

<input type="hidden" name="id" value="<%=u.getId()%>"> 

<table>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" value="<%=u.getFname()%>"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" value="<%=u.getLname()%>"></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type="text" name="mobile" value="<%=u.getMobile()%>"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="email" name="email" value="<%=u.getEmail()%>"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" value="<%=u.getPassword()%>"></td>
		</tr>
		<tr>
			<td><input type="submit" name="action" value="Edit User"></td>
		</tr>
	</table>

</form>

</body>
</html>