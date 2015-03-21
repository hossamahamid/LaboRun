/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Intake;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author dina
 */
public class IntakeDaoImp implements IntakeDaoInt{

    public List<Intake> getIntakes() {
        Session session = Connection.getConnection();
        List<Intake> intakes = null;
        Criteria cr = session.createCriteria(Intake.class);
        intakes = cr.list();

        return intakes;
    }

    public boolean insertIntake(Intake intake) {
        boolean flag = true;
        Session session = Connection.getConnection();
        Criteria cr = session.createCriteria(Intake.class);
        cr.add(Restrictions.eq("intakeNum",intake.getIntakeNum()));
        List results = cr.list();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            
           flag = false;
           System.out.println("intake already exists");
           break;

        }
        if(flag == true){
        session.beginTransaction();
        session.persist(intake);
        session.getTransaction().commit();
        System.out.println("data inserted");
        }
        return flag;
    }
    
}
