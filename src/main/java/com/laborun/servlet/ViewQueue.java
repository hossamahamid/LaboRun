/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.servlet;

import com.laborun.controller.QueueImp;
import com.laborun.entity.QueueD;
import com.laborun.entity.Trainee;
import com.laborun.entity.UserD;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dina
 */
public class ViewQueue extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
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
        System.out.println("inside view queue");
        QueueImp QI = new QueueImp();
      HttpSession session = request.getSession(true);
      QueueD assistance = new QueueD();
      assistance.setId(((QueueD)session.getAttribute("assq")).getId());
      QueueD delv = new QueueD();
      delv.setId(((QueueD) session.getAttribute("delv")).getId());
      
        List<Integer> traineeInQueue = QI.getTraineeInQueue(assistance);
        List<Integer> traineeInQueue1 = QI.getTraineeInQueue(delv);
      
      
      /**************************/
      
      
          PrintWriter out = response.getWriter();
        response.setContentType("text/Xml");
        String xml="<Msgs>";
        
        String Ass = "<Ass>";
        String Am = "<Am>";
        String Delv = "<Delv>";
        String Dm = "<Dm>";
        xml = xml+Ass;
        for(Integer i : traineeInQueue)
        {
            xml = xml+Am+i+"</Am>";
        }
          xml = xml+"</Ass>";
        
           xml = xml+Delv;
        for(Integer i2 : traineeInQueue1)
        {
            xml = xml+Dm+i2+"</Dm>";
        }
          xml = xml+"</Delv>";
        
          xml = xml+"</Msgs>";
        
        
        System.out.println(xml);
       out.println(xml);
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
