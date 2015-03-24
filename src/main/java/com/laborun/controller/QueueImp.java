/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.dao.QueueDaoImp;
import com.laborun.entity.QueueD;
import com.laborun.entity.UserD;
import java.util.List;

/**
 *
 * @author dina
 */
public class QueueImp implements QueueInt{

    public boolean requestQueue(QueueD queue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean removeFromQueue(QueueD queue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<UserD> getTraineeInQueue(QueueD queue) {
        QueueDaoImp q = new QueueDaoImp();
       return q.getTraineeInQueue(queue);
    }
    
}
