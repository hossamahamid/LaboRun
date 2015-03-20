/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Course;
import com.laborun.entity.Group;
import com.laborun.entity.Lab;
import com.laborun.entity.Queue;
import com.laborun.entity.User;
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


    public void removeFromQueue(User user, String queueType) {

    }

    public List<User> getTraineeInQueue(Queue queue) {
        Session session = Connection.getConnection();
        List<User> Trainees = null;
        Criteria cr = session.createCriteria(Queue.class);
        cr.add(Restrictions.eq("id", queue.getId()));
        List results = cr.list();
        Iterator it = results.iterator();
        
        while (it.hasNext()) {
            Trainees = new ArrayList<User>(((Queue) it.next()).getTraineeInQueues());
        }

        return Trainees;
    }

    public void addNewRequest(User user, String queueType, Queue queue) {
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
