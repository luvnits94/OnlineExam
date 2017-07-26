<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>User Home</title>
        <link href="css/bootstrap.css" rel="stylesheet"> 
        <link href="css/bootstrap.css.map" rel="stylesheet"> 
        <link href="css/bootstrap.min.css" rel="stylesheet"> 
        <link href="css/bootstrap.min.css.map" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        
        <core:set var="no_of_qs" value="${5}" scope="session" />
        <core:set var="max_marks" value="${100}" scope="session"  />
        <core:set var="max_time" value="3 hr" scope="session" />
        <core:set var="marks_per_qs" value="${max_marks / no_of_qs}" scope="session" />
        
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
                            <li class="navbar-text">TIME: <core:out value="${max_time}"  /></li>
                            <li class="navbar-text">MAXIMUM MARKS:  <core:out value="${max_marks}"  /> </li>
                            <li class="navbar-text">Each Question Carry   <core:out value="${marks_per_qs}  Marks"  /></li>
                            <li class="navbar-text">Donot Refresh The Browser Before Completing the exam </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <%
            //Redirection if admin tries to access user
                    if(session.getAttribute("user_type") != null){
                        if(session.getAttribute("user_type").equals("admin")){
                            response.sendRedirect("admin_home.jsp");
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