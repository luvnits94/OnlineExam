package com.exam.servlets;
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
/**
 *
 * @author luvni
 */
public class AddQuestionServlet extends HttpServlet {
    PrintWriter out;
    PreparedStatement st1 =null;
    Connection con = null;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
        HttpSession session = null;
        try {
            int status = -1;
//course=%2FJava%2F&question_name=Which+Approach+is+followed+by+Java&op1=OOPS&op2=Procedural&op3=Both&op4=None&ans=OOPS
//course=adsasd question_name=78 op1=78 op2=78 op3=78  op4=787  ans=87
            session = request.getSession();
            out = response.getWriter();
            String qn = request.getParameter("question_name");
            String cn = request.getParameter("course");
            String o1 = request.getParameter("op1");
            String o2 = request.getParameter("op2");
            String o3 = request.getParameter("op3");
            String o4 = request.getParameter("op4");
            String ans = request.getParameter("ans");
            out.print(qn);
            con=DBConnection.establishConnection();
            st1=con.prepareStatement("insert into question_master values(?,?,?,?,?,?,?)");
            st1.setString(2, qn);
            st1.setString(1, cn);
            st1.setString(3, o1);
            st1.setString(4, o2);
            st1.setString(5, o3);
            st1.setString(6, o4);
            st1.setString(7, ans);
            status = st1.executeUpdate();
            if(status > 0){
                String success="Question Added successfully";
                session.setAttribute("succMsg", success);
                session.setAttribute("errMsg", null);
                response.sendRedirect("add_question.jsp");
            }
            else{
                String error="Question Addition Failed";
                session.setAttribute("errMsg", error);
                session.setAttribute("succMsg", null);
                response.sendRedirect("add_question.jsp");
            }
        }
        catch(SQLException ex){
            System.out.println(ex);
              String error="Question Addition Failed";
                session.setAttribute("errMsg", error);
                session.setAttribute("succMsg", null);
                response.sendRedirect("add_question.jsp");
        } 
        catch (IOException ex) {
            out.println(ex);
        }
        finally{
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
