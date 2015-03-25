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
import com.laborun.entity.Trainee;
import com.laborun.entity.UserD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author dina
 */
public class QueueDaoImp implements QueueDaoInt {


    

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


    public void addNewRequest(QueueD queue) {
         Session session = Connection.getConnection();
        session.beginTransaction();
        session.persist(queue);
        session.getTransaction().commit();
        System.out.println("data inserted"); 
    }

    public void removeFromQueue(Trainee trainee, QueueD queue) {
        Session session = Connection.getConnection();
        session.beginTransaction();
        String sql = "DELETE FROM TraineeInQueue WHERE trainee_id = " + trainee.getId() +"and queue_id = " + queue.getId();
        Query query = session.createQuery(sql);
         int row = query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("data removed"); 
    }

}
