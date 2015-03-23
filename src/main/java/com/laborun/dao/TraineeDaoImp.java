/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Intake;
import com.laborun.entity.Trainee;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author dina
 */
public class TraineeDaoImp implements TraineeDaoInt {

    public boolean insertTraineeData(Trainee trainee) {
       
        boolean flag = true;
        Session session = Connection.getConnection();
        Criteria cr = session.createCriteria(Trainee.class);
        cr.add(Restrictions.eq("email",trainee.getEmail()));
        List results = cr.list();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            
           flag = false;
           System.out.println("trainee already exists");
           break;

        }
        
        
        trainee.setRole("trainee");
       
        if(flag == true){
        session.beginTransaction();
        session.persist(trainee);
        session.getTransaction().commit();
        
        System.out.println("data inserted");
        }
        return flag;
    }

    public List<Trainee> getTrainees(Intake intake) {
        Session session = Connection.getConnection();
        List<Trainee> trainee = null;
        Criteria cr = session.createCriteria(Trainee.class);
        trainee = cr.list();
       
        return trainee;
    }

}
