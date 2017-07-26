package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/include/Redirect/admin_or_user.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"css/bootstrap.css.map\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"css/bootstrap.min.css.map\" rel=\"stylesheet\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron container-fluid\">\n");
      out.write("            <center>\n");
      out.write("                <h1>Welcome To Online Exam Portal</h1>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      out.write("                ");

                    //Redirect to user home or admin home
                    if(session.getAttribute("user_type") != null){
                        if(session.getAttribute("user_type").equals("admin")){
                            response.sendRedirect("admin_home.jsp");
                        }
                        else if(session.getAttribute("user_type").equals("user")){
                            response.sendRedirect("user_home.jsp");
                        }
                    }
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"alert alert-danger\">\n");
      out.write("            <h2>\n");
      out.write("                ");
 
                    if(request.getAttribute("errMsg") != null ){
                        out.print(request.getAttribute("errMsg"));
                    }                    
                
      out.write("\n");
      out.write("            </h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"alert alert-success\">\n");
      out.write("            <h2>\n");
      out.write("                ");
 
                    if(request.getAttribute("succMsg") != null ){
                        out.print(request.getAttribute("succMsg"));
                    }                    
                
      out.write("\n");
      out.write("            </h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h4>Please Enter Your Credentials</h4>\n");
      out.write("            <form  action=\"LoginServlet\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"username\">Username</label><br/>\n");
      out.write("                    <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Enter username here\" required><br/><br/>\n");
      out.write("                    <label for=\"password\">Password</label><br/>\n");
      out.write("                    <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Enter password here\" required><br/><br/>\n");
      out.write("                    <div class=\"checkbox\">\n");
      out.write("                        <label><input type=\"checkbox\">Remember me</label>\n");
      out.write("                    </div><br>\n");
      out.write("                    <button class=\"btn btn-primary form-control\" type=\"submit\">Login</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <a href=\"register.jsp\">Not Yet Registered ? Click Here</a>\n");
      out.write("        </div>\n");
      out.write("        </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
