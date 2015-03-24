/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.QueueD;
import com.laborun.entity.Trainee;
import com.laborun.entity.TraineeInQueue;
import com.laborun.entity.TraineeInQueueId;
import org.hibernate.Session;

/**
 *
 * @author dina
 */
public class RequestQueueImp implements RequestQueue{

    public void insertTraineeInQueue(Trainee trainee, QueueD queue) {
          Session session = Connection.getConnection();
        TraineeInQueue t = new TraineeInQueue();
        t.setId(new TraineeInQueueId(trainee.getId(),queue.getId()));
         session.beginTransaction();
        session.persist(t);
        session.getTransaction().commit();
        System.out.println("data inserted"); 
        
    }
    
}
