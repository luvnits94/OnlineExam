package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class viewcourse_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/include/user/user_header.jsp");
    _jspx_dependants.add("/include/user/user_footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_param_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_core_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_core_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_core_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_sql_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_sql;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_core_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_core_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_param_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_core_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_core_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_core_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_sql_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_sql = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_core_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_core_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_param_value_nobody.release();
    _jspx_tagPool_core_out_value_nobody.release();
    _jspx_tagPool_core_choose.release();
    _jspx_tagPool_core_otherwise.release();
    _jspx_tagPool_sql_query_var_sql_nobody.release();
    _jspx_tagPool_sql_query_var_sql.release();
    _jspx_tagPool_core_forEach_var_items.release();
    _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody.release();
    _jspx_tagPool_core_when_test.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>User Home</title>\n");
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
      out.write("                    <div class=\"navbar-header nav-tabs-justified\">\n");
      out.write("                        <a href=\"#\" class=\"navbar-brand \">ONLINE EXAM PORTAL</a>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"nav navbar-nav \">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"viewcourse_user.jsp\">Available Course</a></li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pencil\">StartExam</span></a></li>\n");
      out.write("                        <li><a href=\"#\">Results</a></li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-lock\"></span>Change Password</a></li>\n");
      out.write("                        <!--form class=\"navbar-form navbar-left\">\n");
      out.write("                          <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                            <div class=\"input-group-btn\">\n");
      out.write("                              <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("                                <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("                              </button>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </form-->\n");
      out.write("                    </ul>\n");
      out.write("                    <p class=\"navbar-text\">NAVBAR TEXT</p>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <!--li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li-->\n");
      out.write("                        <li><a href=\"LogoutServlet\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br><br><br><br>\n");
      out.write("         <div class=\"alert alert-danger\">\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<br><br><br><br><br>\n");
      out.write("<h2>Courses</h2>\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <table class=\"table table-striped table-condensed table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                <th>Course</th>\n");
      out.write("                <th>Course Description</th>\n");
      out.write("                <th>Enrollment Options</th>\n");
      out.write("                <th>Approval Status</th>\n");
      out.write("                <th>Exam Status</th>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                ");
      //  core:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_core_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_core_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_core_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_core_forEach_0.setParent(null);
      _jspx_th_core_forEach_0.setVar("data");
      _jspx_th_core_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_core_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_core_forEach_0 = _jspx_th_core_forEach_0.doStartTag();
        if (_jspx_eval_core_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                    <tr> \n");
            out.write("                            <td>");
            if (_jspx_meth_core_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_core_forEach_0, _jspx_page_context, _jspx_push_body_count_core_forEach_0))
              return;
            out.write("</td>\n");
            out.write("                            <td>");
            if (_jspx_meth_core_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_core_forEach_0, _jspx_page_context, _jspx_push_body_count_core_forEach_0))
              return;
            out.write("</td>\n");
            out.write("                            \n");
            out.write("                            ");
            if (_jspx_meth_sql_query_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_core_forEach_0, _jspx_page_context, _jspx_push_body_count_core_forEach_0))
              return;
            out.write("\n");
            out.write("                            ");
            //  core:choose
            org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_core_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_core_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
            _jspx_th_core_choose_0.setPageContext(_jspx_page_context);
            _jspx_th_core_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_forEach_0);
            int _jspx_eval_core_choose_0 = _jspx_th_core_choose_0.doStartTag();
            if (_jspx_eval_core_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n");
                out.write("                                \n");
                out.write("                                \n");
                out.write("                                \n");
                out.write("                                ");
                //  core:when
                org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_core_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_core_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                _jspx_th_core_when_0.setPageContext(_jspx_page_context);
                _jspx_th_core_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_choose_0);
                _jspx_th_core_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs1.getRowCount()>0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_core_when_0 = _jspx_th_core_when_0.doStartTag();
                if (_jspx_eval_core_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                                    <!core:when test=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data2.approval_status.equals(\"Approved\")==true}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                    out.write("\">\n");
                    out.write("                                        \n");
                    out.write("                                    <!Cancel Course >\n");
                    out.write("                                    \n");
                    out.write("                                    \n");
                    out.write("                                        <form action=\"RequestCancellationServlet\">\n");
                    out.write("                                        <td><button class=\"btn btn-danger\" type=\"submit\" name=\"btn_unroll\" value=\"");
                    if (_jspx_meth_core_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_core_when_0, _jspx_page_context, _jspx_push_body_count_core_forEach_0))
                      return;
                    out.write("\">Cancel Course</button></td>\n");
                    out.write("                                        </form>\n");
                    out.write("                                        ");
                    //  core:forEach
                    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_core_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_core_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                    _jspx_th_core_forEach_1.setPageContext(_jspx_page_context);
                    _jspx_th_core_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_when_0);
                    _jspx_th_core_forEach_1.setVar("data2");
                    _jspx_th_core_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs1.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                    int[] _jspx_push_body_count_core_forEach_1 = new int[] { 0 };
                    try {
                      int _jspx_eval_core_forEach_1 = _jspx_th_core_forEach_1.doStartTag();
                      if (_jspx_eval_core_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\n");
                          out.write("                                            <td>");
                          if (_jspx_meth_core_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_core_forEach_1, _jspx_page_context, _jspx_push_body_count_core_forEach_1))
                            return;
                          out.write("</td>\n");
                          out.write("                                            <td>");
                          if (_jspx_meth_core_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_core_forEach_1, _jspx_page_context, _jspx_push_body_count_core_forEach_1))
                            return;
                          out.write("\n");
                          out.write("                                            \n");
                          out.write("                                            <!core:set var=\"blank\" value=\"-\" />\n");
                          out.write("                                            <!core:when test=\"");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data2.exam_status ne blank}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                          out.write("\">\n");
                          out.write("                                            ");

                                                if(!(pageContext.getAttribute("data2.exam_status").equals("-"))){
                                            
                          out.write("\n");
                          out.write("                                                <form action=\"appear_exam.jsp\">\n");
                          out.write("                                                    <button class=\"btn btn-success\" type=\"submit\" name=\"btn_apply_exam\" value=\"");
                          if (_jspx_meth_core_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_core_forEach_1, _jspx_page_context, _jspx_push_body_count_core_forEach_1))
                            return;
                          out.write('"');
                          out.write('>');
                          out.print(pageContext.getAttribute("data2.exam_status") );
                          out.write("</button>\n");
                          out.write("                                                </form>\n");
                          out.write("                                            ");

                                                }
                                            
                          out.write("\n");
                          out.write("                                                <!core:when>\n");
                          out.write("                                                    </td>\n");
                          out.write("                                                    \n");
                          out.write("                                        ");
                          int evalDoAfterBody = _jspx_th_core_forEach_1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_core_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        return;
                      }
                    } catch (Throwable _jspx_exception) {
                      while (_jspx_push_body_count_core_forEach_1[0]-- > 0)
                        out = _jspx_page_context.popBody();
                      _jspx_th_core_forEach_1.doCatch(_jspx_exception);
                    } finally {
                      _jspx_th_core_forEach_1.doFinally();
                      _jspx_tagPool_core_forEach_var_items.reuse(_jspx_th_core_forEach_1);
                    }
                    out.write("\n");
                    out.write("                                    <!core:when>    \n");
                    out.write("                                ");
                    int evalDoAfterBody = _jspx_th_core_when_0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_core_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_core_when_test.reuse(_jspx_th_core_when_0);
                  return;
                }
                _jspx_tagPool_core_when_test.reuse(_jspx_th_core_when_0);
                out.write("\n");
                out.write("                                    \n");
                out.write("                                ");
                if (_jspx_meth_core_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_core_choose_0, _jspx_page_context, _jspx_push_body_count_core_forEach_0))
                  return;
                out.write("\n");
                out.write("                            ");
                int evalDoAfterBody = _jspx_th_core_choose_0.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_core_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_core_choose.reuse(_jspx_th_core_choose_0);
              return;
            }
            _jspx_tagPool_core_choose.reuse(_jspx_th_core_choose_0);
            out.write("\n");
            out.write("                            ");
            if (_jspx_meth_core_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_core_forEach_0, _jspx_page_context, _jspx_push_body_count_core_forEach_0))
              return;
            out.write("\n");
            out.write("                    </tr>\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_core_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_core_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_core_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_core_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_core_forEach_0.doFinally();
        _jspx_tagPool_core_forEach_var_items.reuse(_jspx_th_core_forEach_0);
      }
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("    ");
      out.write("<br><br><br><br><br><br>\n");
      out.write("        <footer>\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-bottom\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <a href=\"#\" class=\"navbar-brand\">ONLINE EXAM PORTAL</a>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class><a href=\"#\">Contact Us</a></li>\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\n");
      out.write("                        <p class=\"navbar-text\">&copy;2017 User Account</p>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#\"><!span class=\"glyphicon glyphicon-user\"></span>facebook</a></li>\n");
      out.write("                        <li><a href=\"#\"><!span class=\"glyphicon glyphicon-log-in\"></span>Twitter</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\t</footer>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3307/db_online_exam");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("password");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setSql("select * from course_master");
    _jspx_th_sql_query_0.setVar("rs");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_sql_nobody.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_core_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_core_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_core_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_core_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_core_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_core_out_0.setPageContext(_jspx_page_context);
    _jspx_th_core_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_forEach_0);
    _jspx_th_core_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.course}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_core_out_0 = _jspx_th_core_out_0.doStartTag();
    if (_jspx_th_core_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_0);
      return true;
    }
    _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_0);
    return false;
  }

  private boolean _jspx_meth_core_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_core_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_core_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_core_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_core_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_core_out_1.setPageContext(_jspx_page_context);
    _jspx_th_core_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_forEach_0);
    _jspx_th_core_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.course_desc}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_core_out_1 = _jspx_th_core_out_1.doStartTag();
    if (_jspx_th_core_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_1);
      return true;
    }
    _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(javax.servlet.jsp.tagext.JspTag _jspx_th_core_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_core_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_forEach_0);
    _jspx_th_sql_query_1.setSql("select exam_status,approval_status from user_course_mapping where login_id=? and course=?");
    _jspx_th_sql_query_1.setVar("rs1");
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_1[0]++;
          _jspx_th_sql_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_sql_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_1, _jspx_page_context, _jspx_push_body_count_sql_query_1))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_sql_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_1, _jspx_page_context, _jspx_push_body_count_sql_query_1))
            return true;
          out.write("\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_sql_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_1[0]--;
      }
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_sql.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_0 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_1);
    _jspx_th_sql_param_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_0 = _jspx_th_sql_param_0.doStartTag();
    if (_jspx_th_sql_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
    return false;
  }

  private boolean _jspx_meth_sql_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_1 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_1);
    _jspx_th_sql_param_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.course}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_1 = _jspx_th_sql_param_1.doStartTag();
    if (_jspx_th_sql_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
    return false;
  }

  private boolean _jspx_meth_core_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_core_when_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_core_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_core_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_core_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_core_out_2.setPageContext(_jspx_page_context);
    _jspx_th_core_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_when_0);
    _jspx_th_core_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.course}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_core_out_2 = _jspx_th_core_out_2.doStartTag();
    if (_jspx_th_core_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_2);
      return true;
    }
    _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_2);
    return false;
  }

  private boolean _jspx_meth_core_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_core_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_core_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_core_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_core_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_core_out_3.setPageContext(_jspx_page_context);
    _jspx_th_core_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_forEach_1);
    _jspx_th_core_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data2.approval_status}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_core_out_3 = _jspx_th_core_out_3.doStartTag();
    if (_jspx_th_core_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_3);
      return true;
    }
    _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_3);
    return false;
  }

  private boolean _jspx_meth_core_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_core_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_core_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_core_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_core_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_core_out_4.setPageContext(_jspx_page_context);
    _jspx_th_core_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_forEach_1);
    _jspx_th_core_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data2.exam_status}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_core_out_4 = _jspx_th_core_out_4.doStartTag();
    if (_jspx_th_core_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_4);
      return true;
    }
    _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_4);
    return false;
  }

  private boolean _jspx_meth_core_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_core_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_core_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_core_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_core_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_core_out_5.setPageContext(_jspx_page_context);
    _jspx_th_core_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_forEach_1);
    _jspx_th_core_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.course}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_core_out_5 = _jspx_th_core_out_5.doStartTag();
    if (_jspx_th_core_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_5);
      return true;
    }
    _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_5);
    return false;
  }

  private boolean _jspx_meth_core_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_core_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_core_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_core_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_core_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_core_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_core_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_choose_0);
    int _jspx_eval_core_otherwise_0 = _jspx_th_core_otherwise_0.doStartTag();
    if (_jspx_eval_core_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <form action=\"EnrollCourseServlet\">\n");
        out.write("                                        <td><button class=\"btn btn-primary\" type=\"submit\" name=\"btn_enroll\" value=\"");
        if (_jspx_meth_core_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_core_otherwise_0, _jspx_page_context, _jspx_push_body_count_core_forEach_0))
          return true;
        out.write("\">Enroll</button></td>\n");
        out.write("                                    </form>\n");
        out.write("                                    <td>-</td>\n");
        out.write("                                    <td>-</td>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_core_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_core_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_core_otherwise.reuse(_jspx_th_core_otherwise_0);
      return true;
    }
    _jspx_tagPool_core_otherwise.reuse(_jspx_th_core_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_core_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_core_otherwise_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_core_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_core_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_core_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_core_out_6.setPageContext(_jspx_page_context);
    _jspx_th_core_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_otherwise_0);
    _jspx_th_core_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.course}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_core_out_6 = _jspx_th_core_out_6.doStartTag();
    if (_jspx_th_core_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_6);
      return true;
    }
    _jspx_tagPool_core_out_value_nobody.reuse(_jspx_th_core_out_6);
    return false;
  }

  private boolean _jspx_meth_core_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_core_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_core_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_core_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_core_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_core_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_core_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_forEach_0);
    _jspx_th_core_forEach_2.setVar("data");
    _jspx_th_core_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs1.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_core_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_core_forEach_2 = _jspx_th_core_forEach_2.doStartTag();
      if (_jspx_eval_core_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_core_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_core_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_core_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_core_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_core_forEach_2.doFinally();
      _jspx_tagPool_core_forEach_var_items.reuse(_jspx_th_core_forEach_2);
    }
    return false;
  }
}
