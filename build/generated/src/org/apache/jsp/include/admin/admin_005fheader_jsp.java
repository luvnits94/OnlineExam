package org.apache.jsp.include.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Admin</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"css/bootstrap.css.map\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"css/bootstrap.min.css.map\" rel=\"stylesheet\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top \">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                             <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a href=\"#\" class=\"navbar-brand \">ONLINE EXAM PORTAL</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav \">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"add_course.jsp\"><span class=\"glyphicon glyphicon-plus\"></span>Add a Course</a></li>\n");
      out.write("                        <li><a href=\"view_course.jsp\">View Course</a></li>\n");
      out.write("                        <li><a href=\"add_question.jsp\"><span class=\"glyphicon glyphicon-plus\"></span>Add a Question</a></li>\n");
      out.write("                        <li><a href=\"approval_request.jsp\">Approval Request</a></li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-lock\"></span>Change Password</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <p class=\"navbar-text\">NAVBAR TEXT</p>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <!--li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li-->\n");
      out.write("                        <li><a href=\"./LogoutServlet\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <br><br><br><br>\n");
      out.write("        \n");
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
      out.write("        </div>");
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
