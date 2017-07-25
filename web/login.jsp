<%-- 
    Document   : index
    Created on : Jul 20, 2017, 9:54:11 PM
    Author     : luvni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.css" rel="stylesheet"> 
        <link href="css/bootstrap.css.map" rel="stylesheet"> 
        <link href="css/bootstrap.min.css" rel="stylesheet"> 
        <link href="css/bootstrap.min.css.map" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div class="jumbotron container-fluid">
            <center>
                <h1>Welcome To Online Exam Portal</h1>
                <%
                    //Redirect to user home and admin home
                    if(session.getAttribute("user_type") != null){
                        if(session.getAttribute("user_type").equals("admin")){
                            response.sendRedirect("admin_home.jsp");
                        }
                        else if(session.getAttribute("user_type").equals("user")){
                            response.sendRedirect("user_home.jsp");
                        }
                    }
                %>
            </center>
        </div>
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
                        out.print(request.getAttribute("errMsg"));
                    }                    
                %>
            </h2>
        </div>
        <div class="container">
            <h4>Please Enter Your Credentials</h4>
            <form  action="LoginServlet">
                <div class="form-group">
                    <label for="username">Username</label><br/>
                    <input type="text" name="username" class="form-control" placeholder="Enter username here" required><br/><br/>
                    <label for="password">Password</label><br/>
                    <input type="password" name="password" class="form-control" placeholder="Enter password here" required><br/><br/>
                    <div class="checkbox">
                        <label><input type="checkbox">Remember me</label>
                    </div><br>
                    <button class="btn btn-primary form-control" type="submit">Login</button>
                </div>
            </form>
            <a href="register.jsp">Not Yet Registered ? Click Here</a>
        </div>
        </body>
</html>
