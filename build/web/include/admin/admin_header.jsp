<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin</title>
        <link href="css/bootstrap.css" rel="stylesheet"> 
        <link href="css/bootstrap.css.map" rel="stylesheet"> 
        <link href="css/bootstrap.min.css" rel="stylesheet"> 
        <link href="css/bootstrap.min.css.map" rel="stylesheet">
        <link href="css/bootstrap.min.css.map" rel="stylesheet">
        <!link href="js/bootstrap.js" rel="script">
        <!link href="js/bootstrap.min.js" rel="script">
        <!link href="js/npm.js" rel="script">

        <meta name="viewport" content="width=device-width, initial-scale=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    
    <body>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        
        <header>
            <nav class="navbar navbar-inverse navbar-fixed-top ">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a href="#" class="navbar-brand ">ONLINE EXAM PORTAL</a>
                    </div>
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav ">
                            <li class="active"><a href="admin_home.jsp">Home</a></li>
                            <li><a href="add_course.jsp"><span class="glyphicon glyphicon-plus"></span>Add a Course</a></li>
                            <li><a href="view_course.jsp">View Course</a></li>
                            <li><a href="add_question.jsp"><span class="glyphicon glyphicon-plus"></span>Add a Question</a></li>
                            <li><a href="approval_request.jsp">Approval Request</a></li>
                            <ul class="nav navbar-nav navbar-right">
                                <!--li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li-->
                                <li><a href="./LogoutServlet"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                            </ul>
                        </ul>
                        
                    </div>
                </div>
            </nav>
        </header>
        <%
            //Redirection if user tries to access admin and vice versa
                    if(session.getAttribute("user_type") != null){
                        if(session.getAttribute("user_type").equals("user")){
                            response.sendRedirect("user_home.jsp");
                        }
                    }
                    else{
                        session.setAttribute("errMsg", "Session Expired");
                        response.sendRedirect("login.jsp");
                    }
                    out.print(session.getAttribute("user_name")); 
        %>
        <br><br><br><br>
        
        <div class="alert alert-danger">
            <h2>
                <% 
                    if(request.getAttribute("errMsg") != null ){
                        out.print(request.getAttribute("errMsg"));
                    }                    
                %>
            </h2>
        </div>
        <div class="alert alert-success">
            <h2>
                <% 
                    if(request.getAttribute("succMsg") != null ){
                        out.print(request.getAttribute("succMsg"));
                    }                    
                %>
            </h2>
        </div>