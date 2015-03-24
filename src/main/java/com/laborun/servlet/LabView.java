package com.laborun.servlet;

import com.laborun.controller.LabImp;
import com.laborun.controller.LabInt;
import com.laborun.entity.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

/**
 * Created by Rainfall on 3/24/2015.
 */
public class LabView extends HttpServlet {
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

        Set<QueueD> queues = lab.getQueueDs();

        QueueD assistanceQueue = new QueueD();
        QueueD deliveryQueue = new QueueD();

        for(QueueD queue: queues){
            if(queue.getQueueType().equals("assistance"))
                assistanceQueue = queue;
            else
                deliveryQueue = queue;
        }

        request.setAttribute("lab", lab);
        request.setAttribute("assistanceQueue", assistanceQueue);
        request.setAttribute("deliveryQueue", deliveryQueue);

        RequestDispatcher dispatcher = request.getRequestDispatcher("lab.jsp");
        dispatcher.forward(request, response);
    }
}
