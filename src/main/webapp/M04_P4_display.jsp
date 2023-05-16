<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P4 Display</title>
</head>
<body>

<%
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String email = request.getParameter("email");
	long mobile = Long.parseLong(request.getParameter("mobile"));
	String gender = request.getParameter("gender");
	String password = request.getParameter("password");
%>
<u><h2>Your Information</h2></u>
<h4>First Name: <%=fname %></h4>
<h4>Last Name: <%=lname %></h4>
<h4>Email: <%=email %></h4>
<h4>Mobile No: <%=mobile %></h4>
<h4>Gender: <%=gender %></h4>
<h4>PAssword: <%=password %></h4>

</body>
</html>