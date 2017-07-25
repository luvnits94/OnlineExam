package com.exam.servlets;
import com.dao.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class RequestCancellationServlet extends HttpServlet {
      PreparedStatement st1 =null;
        Connection con = null;
        HttpSession session ; 
        String app_status="Waiting for Cancellation Approval";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            session=request.getSession();
            int status = -1;
            String cn = request.getParameter("btn_unroll");
            con=DBConnection.establishConnection();
            st1=con.prepareStatement("update user_course_mapping set approval_status=? where login_id=? and course=?");
            st1.setString(2, session.getAttribute("username").toString());
            st1.setString(3, cn);
            st1.setString(1, app_status);
            System.out.println(st1);
            status = st1.executeUpdate();
            if(status>0){
                String success="Cancellation Requested  Successfully";
                //out.println(success);
                session.setAttribute("succMsg", success);
                session.setAttribute("errMsg", null);
                response.sendRedirect("viewcourse_user.jsp");
            }
        } 
        catch(Exception e){
            String error="Cancel Request Failed! ";
            session.setAttribute("errMsg", error);
            session.setAttribute("succMsg", null);
            response.sendRedirect("viewcourse_user.jsp");
        }
        finally {
            out.close();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}