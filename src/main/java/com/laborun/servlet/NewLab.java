/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.servlet;

import com.laborun.controller.CourseImp;
import com.laborun.controller.LabImp;
import com.laborun.controller.LabInt;
import com.laborun.controller.StaffImp;
import com.laborun.entity.Course;
import com.laborun.entity.Lab;
import com.laborun.entity.Staff;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dina
 */
public class NewLab extends HttpServlet {

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
     
       HttpSession session = request.getSession(true);
       CourseImp CI = new CourseImp();
       StaffImp SI = new StaffImp();
      List<Course> c = CI.getCourses();
      List<Staff> s = SI.getStaff();
      session.setAttribute("cList",c);
      session.setAttribute("sList",s);
       response.sendRedirect("/LaboRun/admin/addLab.jsp");   
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
        Lab lab = new Lab();
        lab.setLabName(request.getParameter("LabName"));
       String[] ss = request.getParameterValues("staffn");
      
       Set staffMembers = new HashSet();
       for(String n1 : ss)
      {
          Staff s = new Staff();
          s.setId(Integer.parseInt(n1));
          staffMembers.add(s);
      }
       lab.setStaffs(staffMembers);
       Course c = new Course();
       c.setId(Integer.parseInt(request.getParameter("coursen")));
       lab.setCourse(c);
       LabInt LI = new LabImp();
       LI.insertLab(lab);
       
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
