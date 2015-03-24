package com.laborun.servlet;

import com.laborun.controller.LabImp;
import com.laborun.controller.LabInt;
import com.laborun.entity.Lab;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Rainfall on 3/24/2015.
 */
public class QueuesClosing extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int lId = Integer.parseInt(request.getParameter("lid"));
        String lName = request.getParameter("lname");

        Lab lab = new Lab();
        lab.setId(lId);
        lab.setLabName(lName);

        LabInt labController = new LabImp();
        lab = labController.getLab(lab);
        lab.setLabActive(0);
        labController.updateLab(lab);

        /*request.setAttribute("message", "Lab Queues Have Been Closed.");
        RequestDispatcher dispatcher = request.getRequestDispatcher("lab?lid="+lab.getId()+"&lname="+lab.getLabName());
        dispatcher.forward(request, response);*/
        response.sendRedirect("lab?lid="+lab.getId()+"&lname="+lab.getLabName());
    }
}
