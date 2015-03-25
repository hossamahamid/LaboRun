package com.laborun.servlet;

import com.laborun.controller.LabImp;
import com.laborun.controller.LabInt;
import com.laborun.entity.Lab;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Rainfall on 3/25/2015.
 */
public class deadline extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int lId = Integer.parseInt(request.getParameter("lid"));
        String lName = request.getParameter("lname");
        String deadlineString = request.getParameter("dateLine") + " " +request.getParameter("timeLine");
//        System.out.println(request.getParameter("dateLine") + " " +request.getParameter("timeLine"));

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date deadline = null;
        try {
            deadline = format.parse(deadlineString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Lab lab = new Lab();
        lab.setId(lId);
        lab.setLabName(lName);

        LabInt labController = new LabImp();
        lab = labController.getLab(lab);
        lab.setAssignmentDeadLine(deadline);
        labController.updateLab(lab);

        response.sendRedirect("lab?lid="+lab.getId()+"&lname="+lab.getLabName());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
