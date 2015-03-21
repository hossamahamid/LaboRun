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

    public void insertIntake(Intake intake) {
        Session session = Connection.getConnection();
        session.beginTransaction();
        session.persist(intake);
        session.getTransaction().commit();
        System.out.println("data inserted"); 
    }
    
}
