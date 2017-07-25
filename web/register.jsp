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

                <%
                    if(session.getAttribute("user_type") != null){
                        if(session.getAttribute("user_type").equals("admin")){
                            response.sendRedirect("admin_home.jsp");
                        }
                        else if(session.getAttribute("user_type").equals("user")){
                            response.sendRedirect("user_home.jsp");
                        }
                    }
                %>
            
        <div class="alert alert-danger">
            <h2>
                <% 
                    if(request.getAttribute("errMsg") != null ){
                        out.print(request.getAttribute("errMsg"));
                    }                    
                    if(request.getAttribute("msg") != null){
                        out.print("<h3>"+request.getAttribute("msg")+"</h3>");
                    }
                    if(session.getAttribute("sess_exp_Msg") != null){
                        out.print("<h3>"+session.getAttribute("sess_exp_Msg")+"</h3>");
                    }
                %>
            </h2>
        </div>
        <div class="container">
            <h4>Registration</h4>
            <form  action="RegisterServlet">
                <div class="form-group">
                    <input type="text" name="username" class="form-control" placeholder="Enter username here" required/><br>
                    <input type="password" name="password" class="form-control" placeholder="Enter password here" required/><br>
                    <input type="text" name="first_name" class="form-control" placeholder="Enter First Name Here" required/><br>
                    <input type="text" name="last_name" class="form-control" placeholder="Enter Last Name Here" required/><br>
                    <input type="text" name="age" class="form-control" placeholder="Enter Age Here " required/><br>
                    <input type="text" name="email" class="form-control" placeholder="Enter Email Here" required/><br>
                    <input type="text" name="contact" class="form-control" placeholder="Enter Contact Here" required/><br>
                    <label for="gender">Gender</label>
                    <select name="gender">
                        <option name="male" value="M">Male</option>
                        <option name="female" value="F">Female</option>
                    </select>
                    <input type="text" name="city" class="form-control" placeholder="Enter City Here" required/><br>
                    <input type="text" name="state" class="form-control" placeholder="Enter State Here" required/><br>
                    <input type="text" name="country" class="form-control" placeholder="Enter Country Here" required/><br>
                    <input type="text" name="zip" class="form-control" placeholder="Enter Zip Here" required/><br>
                    <button class="btn btn-success" type="submit" class="form-control"  >Register</button>
                </div>
            </form>
        </div>
            

        </body>
</html>
