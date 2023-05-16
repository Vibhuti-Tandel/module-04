<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P3 Form</title>
</head>
<body>

<form action="P3Controller" method="post">

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
			<td>Email</td>
			<td><input type="email" name="email" ></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type="text" name="mobile" ></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="radio" name="gender" value="Male" >Male
			<input type="radio" name="gender" value="Female">Female</td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" ></td>
		</tr>
		<tr>
			<td><input type="submit" name="action" value="register"></td>
		</tr>
	</table>

</form>

</body>
</html>