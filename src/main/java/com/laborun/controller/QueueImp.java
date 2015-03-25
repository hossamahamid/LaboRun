/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.dao.QueueDaoImp;
import com.laborun.dao.QueueDaoInt;
import com.laborun.entity.QueueD;
import com.laborun.entity.Trainee;
import com.laborun.entity.TraineeInQueue;
import com.laborun.entity.UserD;
import java.util.List;
import java.util.Set;

/**
 *
 * @author dina
 */
public class QueueImp implements QueueInt{

    public boolean requestQueue(QueueD queue) {
        QueueDaoImp QDI = new QueueDaoImp();
        QDI.addNewRequest(queue);
        return true;
    }

    public void removeFromQueue(Trainee trainee,QueueD queue) {
        QueueDaoImp qdi = new QueueDaoImp();
        qdi.removeFromQueue(trainee, queue);
    }

    public List<UserD> getTraineeInQueue(QueueD queue) {
        QueueDaoImp q = new QueueDaoImp();
       return q.getTraineeInQueue(queue);
    }

    @Override
    public void setTraineeInQueue(QueueD queue, Set<TraineeInQueue> traineesInQueue) {
        QueueDaoInt queueDao = new QueueDaoImp();
        queueDao.setTraineeInQueue(queue, traineesInQueue);
    }


}
