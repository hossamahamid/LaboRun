package com.laborun.servlet;

import com.laborun.controller.LabImp;
import com.laborun.controller.LabInt;
import com.laborun.controller.QueueImp;
import com.laborun.controller.QueueInt;
import com.laborun.entity.Lab;
import com.laborun.entity.QueueD;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Set;

/**
 * Created by Rainfall on 3/24/2015.
 */
public class QueuesShifting extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
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

        QueueInt queueController = new QueueImp();

        Set<Lab> otherLabs = lab.getCourse().getLabs();

        for (Lab otherLab: otherLabs){
            if (otherLab.getStartTime().getTime() > lab.getStartTime().getTime()){
            
            Set<QueueD> otherQueues = otherLab.getQueueDs();
                for(QueueD queue: otherQueues){
                    if(queue.getQueueType().equals("assistance"))
                        queueController.setTraineeInQueue(queue, assistanceQueue.getTraineeInQueues());
                    else
                        queueController.setTraineeInQueue(queue, deliveryQueue.getTraineeInQueues());
                }

                RequestDispatcher dispatcher = request.getRequestDispatcher("closeQueue?lid="+lab.getId()+"&lname="+lab.getLabName());
                dispatcher.forward(request, response);
                break;
            }
            
        }
   //     response.sendRedirect("lab?lid="+lab.getId()+"&lname="+lab.getLabName()+"&msg=Shift");
    }
}
