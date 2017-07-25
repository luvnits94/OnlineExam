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
        <header>
            <nav class="navbar navbar-inverse navbar-fixed-top ">
                <div class="container-fluid">
                    <div class="navbar-header nav-tabs-justified">
                        <a href="#" class="navbar-brand ">ONLINE EXAM PORTAL</a>
                    </div>
                    <ul class="nav navbar-nav ">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="viewcourse_user.jsp">Available Course</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-pencil">StartExam</span></a></li>
                        <li><a href="#">Results</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-lock"></span>Change Password</a></li>
                        <!--form class="navbar-form navbar-left">
                          <div class="input-group">
                            <input type="text" class="form-control" placeholder="Search">
                            <div class="input-group-btn">
                              <button class="btn btn-default" type="submit">
                                <i class="glyphicon glyphicon-search"></i>
                              </button>
                            </div>
                          </div>
                        </form-->
                    </ul>
                    <p class="navbar-text">NAVBAR TEXT</p>
                    <ul class="nav navbar-nav navbar-right">
                        <!--li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li-->
                        <li><a href="LogoutServlet"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                    </ul>
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