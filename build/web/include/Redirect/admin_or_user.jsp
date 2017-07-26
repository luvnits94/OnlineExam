                <%
                    //Redirect to user home or admin home
                    if(session.getAttribute("user_type") != null){
                        if(session.getAttribute("user_type").equals("admin")){
                            response.sendRedirect("admin_home.jsp");
                        }
                        else if(session.getAttribute("user_type").equals("user")){
                            response.sendRedirect("user_home.jsp");
                        }
                    }
                %>