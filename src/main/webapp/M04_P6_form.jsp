<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P6 Form</title>
</head>
<body>
<u><h2>Register Yourself</h2></u>
<form action="P6Controller" method="post">
<%String msg = (String)request.getAttribute("msg"); %>
<%if(msg!=null){ %>
<h3><%=msg %></h3>
<%} %>

<%String msg1 = (String)request.getAttribute("msg1"); %>
<%if(msg1!=null){ %>
<h3><%=msg1 %></h3>
<%} %>

<%String msg2 = (String)request.getAttribute("msg2"); %>
<%if(msg2!=null){ %>
<h3><%=msg2 %></h3>
<%} %>

<%String msg3 = (String)request.getAttribute("msg3"); %>
<%if(msg3!=null){ %>
<h3><%=msg3 %></h3>
<%} %>

<%String msg4 = (String)request.getAttribute("msg4"); %>
<%if(msg4!=null){ %>
<h3><%=msg4 %></h3>
<%} %>

<%String msg5 = (String)request.getAttribute("msg5"); %>
<%if(msg5!=null){ %>
<h3><%=msg5 %></h3>
<%} %>
	<table>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" ></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" ></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type="text" name="mobile" ></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="email" name="email" ></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" ></td>
		</tr>
		<tr>
			<td><input type="submit" name="action" value="Register"></td>
		</tr>
	</table>

</form>

</body>
</html>