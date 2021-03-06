package com.exam.servlets;
import com.Message.Messages;
import com.dao.DBConnection;
import com.exam.session.Session;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
    Connection con;
    PrintWriter out;
    HttpSession session;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response){
        try{
             out = response.getWriter();

            PreparedStatement st;
            int status = -1;
            ResultSet rs = null;
            ResultSet rs1 = null;
            
            String u = request.getParameter("username");
            String p = request.getParameter("password");
            
            con  = DBConnection.establishConnection();
            //out.println(u+p);
            st = con.prepareCall("select login_master.login_id ,first_name ,type,session_info,session_id from login_master,user_info where login_master.login_id=user_info.login_id and login_master.login_id= ? and password = ?");
            st.setString(1, u);
            st.setString(2, p);
            rs = st.executeQuery();
            if(rs.next()){
//                out.println(rs.getString(1)+rs.getString(2)+rs.getInt(3));
//                creating session
                if(rs.getInt(4) == 0 || (rs.getInt(4) == 1 && request.getSession().getId().equals(rs.getString(5)))){
                    // Either Not Logged in Anywhere Or Session Id Matches
                    logIn(request,response,rs);
                }
                else{
                    Messages.errorMessage(request, response, "User Already Logged In Another Machine , Please Log Out To Continue","login.jsp");
                }
                if(rs.getInt(3) == 1){
                    session.setAttribute("user_type","admin");
                    Messages.successMessage(request, response,"Admin Successfully Logged IN","admin_home.jsp");
                    //response.sendRedirect("admin_home.jsp");
                }
                else if(rs.getInt(3) == 2){
                    session.setAttribute("user_type","user");
                    Messages.successMessage(request, response,"User Successfully Logged IN","user_home.jsp");
//                    /response.sendRedirect(".jsp");
                }
            }
            else{
                Messages.errorMessage(request, response,"Incorrect Crededntials !! Please Enter Correct Username And Password!","login.jsp");
            }
            
        }
        catch(IOException ex){
            System.err.println(ex);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        catch(NumberFormatException ex){
            System.out.println(ex);
        } catch (ServletException ex) {
            System.out.println(ex);
        }
        finally {
//            DBConnection.closeConnection(con);
            out.close();
        }
    }   
    
    public void logIn(HttpServletRequest request,HttpServletResponse response,ResultSet rs) throws ServletException, IOException, SQLException{
                    session = request.getSession(true);
                    Session.sessionUpdate(con,rs.getString(1),1,request.getSession().getId());
                    session.setAttribute("username",rs.getString(1));
                    session.setAttribute("first_name",rs.getString(2));
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
