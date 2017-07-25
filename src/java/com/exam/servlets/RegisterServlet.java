/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.servlets;

import com.Message.Messages;
import com.dao.DBConnection;
import java.sql.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sun.rmi.log.LogInputStream;

/**
 *
 * @author luvni
 */
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    PrintWriter out;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        CallableStatement st = null;
        Connection con=null;
        int status = -1;
        out = response.getWriter();
        try {
            con=DBConnection.establishConnection();
            st = con.prepareCall("call new_user(?,?,?,?,?,?,?,?,?,?,?,?)");
            
            st.setString(1,request.getParameter("username"));
            st.setString(2,request.getParameter("password"));
            st.setString(3,request.getParameter("first_name"));
            st.setString(4,request.getParameter("last_name"));
            st.setInt(5,Integer.parseInt(request.getParameter("age")));
            st.setString(6,request.getParameter("email"));
            st.setString(7,("contact"));
            st.setString(8,request.getParameter("gender"));
            st.setString(9,request.getParameter("city"));
            st.setString(10,request.getParameter("state"));
            st.setString(11,request.getParameter("country"));
            st.setString(12,request.getParameter("zip"));
            status = st.executeUpdate();
            System.out.print(st);
            System.out.print(status);
            out.print(status);
            if(status > 0){
               Messages.successMessage(request, response, "Registration Successful !","login.jsp");
            
            }
            else{
                Messages.errorMessage(request, response, "Registration Failed due to some Error! Please Try Again Later","login.jsp");
            }
        } 
        catch (SQLException ex) {
                out.print(ex);
                Messages.errorMessage(request, response, "Registration Failed! Please Choose A Unique UserName","login.jsp");
        }
        catch(NumberFormatException ex){
                out.print(ex);
                Messages.errorMessage(request, response, "Registration Failed ! Age and Contact Number should be a Number","login.jsp");
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
