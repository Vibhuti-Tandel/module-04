<%@page import="model.DeletedStudentP7"%>
<%@page import="model.StudentP7"%>
<%@page import="dao.StudentDaoP7"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	int id = Integer.parseInt(request.getParameter("id"));
	StudentP7 s = (StudentP7)StudentDaoP7.getStudentById(id);
    StudentDaoP7.deleteStudent(s);
    
    
    DeletedStudentP7 d = new DeletedStudentP7();
    d.setFname(s.getFname());
    d.setLname(s.getLname());
    d.setEmail(s.getEmail());
    d.setMobile(s.getMobile());
    d.setGender(s.getGender());
    d.setPassword(s.getPassword());
    StudentDaoP7.insertDeletedStudent(d);
    
    response.sendRedirect("M04_P7_display.jsp");
%>

</body>
</html>