/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.servlets;
import com.dao.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
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
        PreparedStatement st1;
        int status=-1;
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
            
            Connection con=DBConnection.establishConnection();
            st1=con.prepareStatement("insert into result_master (login_id,course,date,total) values(\"puja\",\"Android\",DATE '2015-12-17',25);");
            st1.setString(1,(String)session.getAttribute("username"));
            //st1.setString(2, );
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
        catch(Exception e){
            System.out.println(e);
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
