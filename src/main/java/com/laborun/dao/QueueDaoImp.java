/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Course;
import com.laborun.entity.GroupD;
import com.laborun.entity.Lab;
import com.laborun.entity.QueueD;
import com.laborun.entity.UserD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author dina
 */
public class QueueDaoImp implements QueueDaoInt {


    public void removeFromQueue(UserD user, String queueType) {

    }

    public List<UserD> getTraineeInQueue(QueueD queue) {
        Session session = Connection.getConnection();
        List<UserD> Trainees = null;
        Criteria cr = session.createCriteria(QueueD.class);
        cr.add(Restrictions.eq("id", queue.getId()));
        List results = cr.list();
        Iterator it = results.iterator();
        
        while (it.hasNext()) {
            Trainees = new ArrayList<UserD>(((QueueD) it.next()).getTraineeInQueues());
        }

        return Trainees;
    }

    public void addNewRequest(UserD user, String queueType, QueueD queue) {
       /* Session session = Connection.getConnection();
        Queue queue = new Queue();
        queue.setLab(lab);
        queue.setQueueType(queueType);
        
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        System.out.println("data inserted");*/
    }

}
