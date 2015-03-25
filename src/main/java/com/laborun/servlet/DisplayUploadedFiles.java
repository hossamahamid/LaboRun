/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.servlet;

import com.laborun.dao.AssignmentDaoImp;
import com.laborun.entity.*;
import com.laborun.entity.Trainee;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayUploadedFiles extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String id = request.getParameter("trainee_id");
//        String labId = request.getParameter("lab_id");
        String id = "3";
        String labId = "1";
        System.out.println(id);
        System.out.println(labId);
        int trainee_id = Integer.parseInt(id);
        int lab_id = Integer.parseInt(labId);

        Trainee trainee = new Trainee();
        trainee.setId(trainee_id);

        Lab lab = new Lab();
        lab.setId(lab_id);
        
                     
        AssignmentDaoImp assignment = new AssignmentDaoImp();
        
        List<AssignmentFiles> files = assignment.getAssignments(lab);

        System.out.println(files);

        File[] array = new File[files.size()];

        for (int i = 0; i < array.length; i++) {
            FileOutputStream fileOuputStream = new FileOutputStream(array[i]);
            fileOuputStream.write(files.get(i).getUploadFile());
            fileOuputStream.close();
            System.out.println(files.get(i));
        }
        request.setAttribute("listOfFiles", files);
        request.getRequestDispatcher("buttons.jsp").forward(request, response);
    }

}
