<%@page import="dao.StudentDaoP7"%>
<%@page import="model.StudentP7"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>P7 Edit</title>

    <!-- Icons font CSS-->
    <link href="form/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="form/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="form/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="form/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="form/css/main.css" rel="stylesheet" media="all">
</head>

<body>
    <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title">Update Student Detail</h2>
                    <form action="P7Controller" method="POST">
                    <%int id = Integer.parseInt(request.getParameter("id")); %>
                    <%StudentP7 s = (StudentP7)StudentDaoP7.getStudentById(id); %>
                    <input type="hidden" name="id" value="<%=s.getId()%>">
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">First name</label>
                                    <input class="input--style-4" type="text" name="fname" value="<%=s.getFname()%>">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Last name</label>
                                    <input class="input--style-4" type="text" name="lname" value="<%=s.getLname()%>">
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Email</label>
                                    <input class="input--style-4" type="email" name="email" value="<%=s.getEmail()%>">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Mobile</label>
                                    <input class="input--style-4" type="text" name="mobile" value="<%=s.getMobile()%>">
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Gender</label>
                                    <div class="p-t-10">
                                        <label class="radio-container m-r-45">Male
                                            <input type="radio" name="gender" value="<%=s.getGender()%>">
                                            <span class="checkmark"></span>
                                        </label>
                                        <label class="radio-container">Female
                                            <input type="radio" name="gender" value="<%=s.getGender()%>">
                                            <span class="checkmark"></span>
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Password</label>
                                    <input class="input--style-4" type="password" name="password" value="<%=s.getPassword()%>">
                                </div>
                            </div>
                            
                        </div>
                        
                        
                        <div class="p-t-15">
                            <button class="btn btn--radius-2 btn--blue" type="submit" name="action" value="Update">Update</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="form/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="form/vendor/select2/select2.min.js"></script>
    <script src="form/vendor/datepicker/moment.min.js"></script>
    <script src="form/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="form/js/global.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->