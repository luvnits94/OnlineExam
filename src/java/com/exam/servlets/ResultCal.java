/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.servlets;
import com.Message.Messages;
import com.dao.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ResultCal extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session;
        PreparedStatement st1,st2;
        int status1=-1;
        int status2=-1;
        int correct_qs=0;
        try {
            session = request.getSession();
            ArrayList a = new ArrayList();
            a = (ArrayList) session.getAttribute("ans_list");
            
            for(Object o : a ){
                out.println((String)o+"<br>");
            }
            for(int i=0 ; i<a.size();i++){
                String q = "qs"+(i+1);
                //out.print(q+"   ");
                //out.print(request.getParameter(q)+"<br>");
                if((request.getParameter(q)).equals(a.get(i))){
                    correct_qs++;
                }
            }
            out.println("<br><br>Correct Qs:"+" "+correct_qs+"<br>");
            out.println("No of Qs"+session.getAttribute("no_of_qs"));
            out.println("Marks per Qs"+session.getAttribute("marks_per_qs"));
                        

            Long noq = (Long) session.getAttribute("no_of_qs");
            Double mpq = (Double) session.getAttribute("marks_per_qs");
            Double result =  correct_qs*mpq;
            out.println("<br><br>Correct Qs:"+" "+correct_qs+"<br>");
            out.println("<br>"+"No Of QS  "+noq);
            out.println("Marks per Qs "+mpq);
            out.println("<br>Result  "+result);
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate localDate = LocalDate.now();
            System.out.println(dtf.format(localDate)); //2016/11/16
            
            
            Connection con=DBConnection.establishConnection();
            st1=con.prepareStatement("insert into result_master (login_id,course,date,total) values(?,?,now(),?);");
            st1.setString(1,(String)session.getAttribute("username"));
            st1.setString(2,(String)session.getAttribute("course_exam"));
            st1.setDouble(3,result);
            
            st2=con.prepareStatement("update user_course_mapping set approval_status = ? , exam_status = ? where course =? and login_id =?");
            st2.setString(1,"-");
            st2.setString(2,"Appeared");
            st2.setString(3,(String)session.getAttribute("course_exam"));
            st2.setString(4,(String)session.getAttribute("username"));
            
            
            
            status1 = st1.executeUpdate();
            status2 = st2.executeUpdate();
            if(status1 > 0 ){
                Messages.successMessage(request, response, "Result Published Successfully Your Score : "+result, "viewcourse_user.jsp");
            }
            else{
                Messages.errorMessage(request, response, "Result Publishing Failed", "viewcourse_user.jsp");
            }
        } 
        catch(NullPointerException e){
            out.println(e);
        } catch (SQLException ex) {
            out.println(ex);
            Logger.getLogger(ResultCal.class.getName()).log(Level.SEVERE, null, ex);
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
