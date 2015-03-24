/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.servlet;

import com.laborun.controller.CourseImp;
import com.laborun.controller.GroupImp;
import com.laborun.controller.IntakeImp;
import com.laborun.controller.IntakeInt;
import com.laborun.controller.StaffImp;
import com.laborun.controller.TraineeImp;
import com.laborun.entity.Course;
import com.laborun.entity.GroupD;
import com.laborun.entity.Intake;
import com.laborun.entity.Staff;
import com.laborun.entity.Trainee;
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
public class NewGroup extends HttpServlet {

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
      TraineeImp  TI= new TraineeImp();
       List<Trainee> t = TI.getTrainees();
       HttpSession session = request.getSession(true);
       session.setAttribute("tList",t);
       CourseImp CI = new CourseImp();
       StaffImp SI = new StaffImp();
      List<Course> c = CI.getCourses();
      List<Staff> s = SI.getStaff();
      IntakeInt II = new IntakeImp();
      List<Intake> i = II.getIntakes();
      session.setAttribute("cList",c);
      session.setAttribute("sList",s);
      session.setAttribute("iList",i);
       response.sendRedirect("/LaboRun/admin/addGroup.jsp");
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
      GroupImp gI = new GroupImp();
      GroupD g = new GroupD();
      Intake i = new Intake();
      Set courses = new HashSet();
      g.setGroupName(request.getParameter("GroupName"));
      System.out.println(Integer.parseInt(request.getParameter("intaken")));
      i.setId(Integer.parseInt(request.getParameter("intaken")));
      
      String[] cc = request.getParameterValues("coursen");
      for(String n : cc)
      {
          Course c = new Course();
          c.setId(Integer.parseInt(n));
          courses.add(c);
      }
      
       String[] ss = request.getParameterValues("staffn");
      Set staffMembers = new HashSet();
       for(String n1 : ss)
      {
          Staff s = new Staff();
          s.setId(Integer.parseInt(n1));
          staffMembers.add(s);
      }
       
       String[] tt = request.getParameterValues("traineen");
     
       for(String n2 : tt)
      {
          Trainee t = new Trainee();
          t.setId(Integer.parseInt(n2));
          staffMembers.add(t);
      }
       
      g.setCourses(courses);
      g.setUserDs(staffMembers);
      g.setIntake(i);
      gI.insertNewGroup(g);
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
