/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.servlet;

import com.laborun.controller.AssignmentInt;
import com.laborun.dao.AssignmentDaoImp;
import com.laborun.entity.*;
import com.laborun.entity.Trainee;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetAssignmentFiles extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("trainee_id");
        String labId = request.getParameter("lab_id");
        int trainee_id = Integer.parseInt(id);
        int lab_id = Integer.parseInt(labId);
        
        Trainee trainee=new Trainee();
        trainee.setId(trainee_id);
        
        Lab lab=new Lab();
        lab.setId(lab_id);
        
        AssignmentInt assignment=(AssignmentInt) new AssignmentDaoImp();
        List<AssignmentFiles> files=assignment.getAssignments(trainee, lab);
        request.setAttribute("listOfFiles",files);
        request.getRequestDispatcher("buttons.jsp").forward(request, response);
    }

}
