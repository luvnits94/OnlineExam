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
        
        <core:set var="no_of_qs" value="${5}" scope="session" />
        <core:set var="max_marks" value="${100}" scope="session"  />
        <core:set var="max_time" value="3 hr" scope="session" />
        
        <core:set var="marks_per_qs" value="${max_marks / no_of_qs}" scope="session" />
        
        <header>
            <nav class="navbar navbar-inverse navbar-fixed-top ">
                <div class="container-fluid">
                    <div class="navbar-header nav-tabs-justified">
                        <a href="#" class="navbar-brand ">ONLINE EXAM PORTAL</a>
                    </div>
                    <ul class="nav navbar-nav ">
                        <li class="navbar-text">TIME: <core:out value="${max_time}"  /></li>
                        <li class="navbar-text">MAXIMUM MARKS:  <core:out value="${max_marks}"  /> </li>
                        <li class="navbar-text">Each Question Carry   <core:out value="${marks_per_qs}  Marks"  /></li>
                        <li class="navbar-text">Donot Refresh The Browser Before Completing the exam </li>
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
                <% 
                    if(request.getAttribute("succMsg") != null ){
                        out.print(request.getAttribute("succMsg"));
                    }                    
                %>
            </h2>
        </div>