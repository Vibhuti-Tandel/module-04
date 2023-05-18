<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql"
prefix="sql"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL JSTL Library</title>
</head>
<body>

<sql:setDataSource var="db"
driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/swingass"
user="root" password=""/>

<sql:query dataSource="${db}" var="rs">
	SELECT * FROM student;
</sql:query>

<center>
	<h1>Student Information</h1>
	<table border="1" width="70%">
	<tr>
		<th>S_No</th>
		<th>ID</th>
		<th>Name</th>
		<th>Gender</th>
		<th>Address</th>
		<th>Contact</th>
	</tr>
	<c:forEach var="table" items="${rs.rows}">
	<tr>
		<td><c:out value="${table.S_No}"></c:out></td>
		<td><c:out value="${table.ID}"></c:out></td>
		<td><c:out value="${table.Name}"></c:out></td>
		<td><c:out value="${table.Gender}"></c:out></td>
		<td><c:out value="${table.Address}"></c:out></td>
		<td><c:out value="${table.Contact}"></c:out></td>
	</tr>
	</c:forEach>
	</table>
</center>

</body>
</html>