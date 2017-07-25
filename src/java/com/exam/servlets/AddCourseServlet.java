package com.exam.servlets;
import com.dao.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author luvni
 */
public class AddCourseServlet extends HttpServlet {
    PrintWriter out;
    PreparedStatement st1 =null;
    Connection con = null;
    HttpSession session ; 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
        try {
            session=request.getSession();
            int status = -1;
            String cn = request.getParameter("course_name");
            String cd = request.getParameter("course_desc");
            con=DBConnection.establishConnection();
            st1=con.prepareStatement("insert into course_master values(?,?)");
            st1.setString(1, cn);
            st1.setString(2, cd);
            status = st1.executeUpdate();
            if(status > 0){
                String success="Course Added Successfully";
                //out.println(success);
                session.setAttribute("succMsg", success);
                session.setAttribute("errMsg", null);
                response.sendRedirect("view_course.jsp");
            }
            else{
                String error="Course Addition Failed";
                session.setAttribute("errMsg", error);
                session.setAttribute("succMsg", null);
                response.sendRedirect("view_course.jsp");
            }
        }
        catch(SQLException ex){
                String error="Course Addition Failed";
                session.setAttribute("errMsg", error);
                session.setAttribute("succMsg", null);
                response.sendRedirect("view_course.jsp");
        } catch (IOException ex) {
            out.println(ex);
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
