package com.exam.servlets;
import com.Message.Messages;
import com.dao.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CourseApprovalServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out;
        PreparedStatement st1 =null;
        Connection con = null;
        HttpSession session = null;
        String cn = request.getParameter("btn_approve_course");
        String user = request.getParameter("approve_user");
        
        try {
            int status = -1;
            session = request.getSession();
            con=DBConnection.establishConnection();
            st1=con.prepareStatement("update user_course_mapping set approval_status =? , exam_status = ? where course =? and login_id =?");
            st1.setString(1,"Approved");
            st1.setString(2,"Not Appeared");
            st1.setString(3,request.getParameter("btn_approve_course"));
            st1.setString(4,request.getParameter("approve_user"));
            status = st1.executeUpdate();
            if(status>0){
                Messages.successMessage(request, response, "Course Approved  Successfully", "approval_request.jsp");
            }
            else{
                Messages.errorMessage(request, response, "Course Approve Failure.. ! ", "approval_request.jsp");
            }
        } 
        catch(SQLException e){
             Messages.errorMessage(request, response, "Course Approve Failure.. ! ", "approval_request.jsp");
        }
        finally {
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