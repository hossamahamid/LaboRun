/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.servlet;

import com.laborun.controller.DepartmentImp;
import com.laborun.controller.IntakeImp;
import com.laborun.controller.TraineeImp;
import com.laborun.entity.Department;
import com.laborun.entity.Intake;
import com.laborun.entity.Trainee;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
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
public class NewTrainee1 extends HttpServlet {

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
        
      
        DepartmentImp DI = new DepartmentImp();
         IntakeImp II = new IntakeImp();
        List<Department> d = DI.getDepartments();
        HttpSession session = request.getSession(true);
            session.setAttribute("dList",d);
       // request.setAttribute("dList", d);
        List<Intake> i = II.getIntakes();
        session.setAttribute("iList",i);
          response.sendRedirect("addTrainee.jsp");
       
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
    TraineeImp TI = new TraineeImp();
       Trainee t = new Trainee();
       Department d = new Department();
     
               
       d.setId(Integer.parseInt(request.getParameter("selectedDepartment")) );
       Intake i = new Intake();
       i.setId(Integer.parseInt(request.getParameter("selectedIntake")) );
      // System.out.println(request.getParameter("selectedDepartment"));
       t.setDepartment(d);
       t.setIntake(i);
       t.setName(request.getParameter("Name"));
       t.setPhoneNumber(request.getParameter("phoneNumber"));
       t.setEmail(request.getParameter("email"));
       t.setUserPassword(request.getParameter("password"));
       t.setAddress(request.getParameter("address"));
       t.setAge(Integer.parseInt(request.getParameter("age")));
       t.setActive(1);
        response.sendRedirect("addTrainee.jsp");
       System.out.print( TI.insertTraineeData(t));
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
