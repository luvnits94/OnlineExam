/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Message;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luvni
 */
public class Messages {
    public static void errorMessage(HttpServletRequest request,HttpServletResponse response,String errMsg,String dest) {
                    request.setAttribute("errMsg", errMsg);
                    request.setAttribute("succMsg", null);
                    RequestDispatcher rd = request.getRequestDispatcher(dest);
        try {
            rd.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(Messages.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Messages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void successMessage(HttpServletRequest request,HttpServletResponse response,String succMsg,String dest) {
                    request.setAttribute("succMsg", succMsg);
                    request.setAttribute("errMsg", null);
                    RequestDispatcher rd = request.getRequestDispatcher(dest);
        try {
            rd.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(Messages.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Messages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void nullifySuccErrMessages(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
                    request.setAttribute("succMsg", null);
                    request.setAttribute("errMsg", null);
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
    }
    
    
}
