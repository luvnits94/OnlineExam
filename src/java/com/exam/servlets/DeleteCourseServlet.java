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
public class DeleteCourseServlet extends HttpServlet {
    PrintWriter out ;
    PreparedStatement st1;
    Connection con;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            out = response.getWriter();
            int status = -1;
            String cn = request.getParameter("btn_del");
            HttpSession session = request.getSession();
            try {
            con=DBConnection.establishConnection();
            st1=con.prepareStatement("delete from course_master where course = ?");
            st1.setString(1,cn);
            status = st1.executeUpdate();
            if(status > 0){
                Messages.successMessage(request, response, "Course Deleted successfully", "view_course.jsp");
            }
            else{
                Messages.errorMessage(request, response, "Course Deletion Failed", "view_course.jsp");
            }
        }
        catch(SQLException ex){
            System.out.println(ex);
                Messages.errorMessage(request, response, "Course Deletion Failed", "view_course.jsp");
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
