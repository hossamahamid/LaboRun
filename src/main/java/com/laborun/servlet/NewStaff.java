/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.servlet;

import com.laborun.controller.DepartmentImp;
import com.laborun.controller.StaffImp;
import com.laborun.controller.StaffInt;
import com.laborun.entity.Department;
import com.laborun.entity.Staff;
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
public class NewStaff extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
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
        List<Department> d = DI.getDepartments();
       Iterator i = d.iterator();
        while (i.hasNext()) {
          System.out.println(((Department) i.next()).getDepartmentName());
        }
        HttpSession session = request.getSession(true);
        session.setAttribute("dList2",d);
       response.sendRedirect("admin/addInstructor.jsp");
      
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
        StaffInt SI = new StaffImp();
        Staff s = new Staff();
      
       Department d = new Department();
     
               
      // d.setId(Integer.parseInt(request.getParameter("selectedDepartment")) );
       
       //s.setDepartment(d);
       s.setName(request.getParameter("Name"));
       s.setPhoneNumber(request.getParameter("phoneNumber"));
       s.setEmail(request.getParameter("email"));
       s.setUserPassword(request.getParameter("password"));
       s.setAddress(request.getParameter("address"));
       s.setAge(Integer.parseInt(request.getParameter("age")));
       s.setActive(1);
       SI.insertStaffData(s);
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
