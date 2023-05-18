<%@page import="model.DeletedStudentP7"%>
<%@page import="dao.StudentDaoP7"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
  	<title>Deleted Table P7</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<link rel="stylesheet" href="table/css/style.css">

	</head>
	<body>
	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center mb-5">
					<h2 class="heading-section">All Deleted Student Information</h2>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="table-wrap">
						<table class="table">
						  <thead class="thead-primary">
						    <tr>
						      <th>ID</th>
						      <th>First Name</th>
						      <th>Last Name</th>
						      <th>Email </th>
						      <th>Mobile </th>
						      <th>Gender </th>
						      <th>Password </th>
						      
						    </tr>
						  </thead>
						  <tbody>
						  <%List<DeletedStudentP7> list = StudentDaoP7.getAllDeletedStudent(); %>
						  <%for(DeletedStudentP7 s:list){ %>
						    <tr>
						      <th scope="row"><%=s.getId() %></th>
						      <td><%=s.getFname() %></td>
						      <td><%=s.getLname() %></td>
						      <td><%=s.getEmail() %></td>
						      <td><%=s.getMobile() %></td>
						      <td><%=s.getGender() %></td>
						      <td><%=s.getPassword() %></td>
						    </tr>
						   <%} %>
						    
						  </tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</section>

	<script src="table/js/jquery.min.js"></script>
  <script src="table/js/popper.js"></script>
  <script src="table/js/bootstrap.min.js"></script>
  <script src="table/js/main.js"></script>

	</body>
</html>

