                String error = "Incorrect Credentials! Please Try Again";
                request.setAttribute("errMsg", error);
                request.setAttribute("succMsg", null);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);