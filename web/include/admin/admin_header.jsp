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
                        <li><a href="add_course.jsp"><span class="glyphicon glyphicon-plus"></span>Add a Course</a></li>
                        <li><a href="view_course.jsp">View Course</a></li>
                        <li><a href="add_question.jsp"><span class="glyphicon glyphicon-plus"></span>Add a Question</a></li>
                        <li><a href="approval_request.jsp">Approval Request</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-lock"></span>Change Password</a></li>
                    </ul>
                    <p class="navbar-text">NAVBAR TEXT</p>
                    <ul class="nav navbar-nav navbar-right">
                        <!--li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li-->
                        <li><a href="./LogoutServlet"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                    </ul>
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
        
    <core:set var="abc" value="alert alert-success"/>
    <core:if test="${requestScope.errMsg ne null} ">
        <core:set var="abc" value="alert alert-danger"/>
        <%-- out.print("class='alert alert-danger'"); --%>
    </core:if>
    
    
    <core:if test="${requestScope.succMsg ne null}">
        <core:set var="abc" value="alert alert-success"></core:set>
            <% out.print("class='alert alert-success'"); %>
    </core:if>
            <div class="<core:out value="${abc}"></core:out>">
            <h2>
                 ${sessionScope.errMsg}
                 
                <% 
                    if(request.getAttribute("errMsg") != null ){
                        out.print(request.getAttribute("errMsg"));
                    }                    
                %>
                ${sessionScope.succMsg}
                <core:remove var="succMsg"  scope="session"/>
               
                <% 
                    if(request.getAttribute("succMsg") != null ){
                        out.print(request.getAttribute("succMsg"));
                    }                    
                %>
            </h2>
        </div>