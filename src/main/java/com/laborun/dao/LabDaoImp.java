/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Course;
import com.laborun.entity.GroupD;
import com.laborun.entity.Lab;
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
public class LabDaoImp implements LabDaoInt{

    public List<Lab> getLabs(Course course) {
        Session session = Connection.getConnection();
        List<Lab> labs = null;
        Criteria cr = session.createCriteria(Course.class);
        cr.add(Restrictions.eq("id", course.getId()));
        List results = cr.list();
        Iterator it = results.iterator();
        
        while (it.hasNext()) {
            labs = new ArrayList<Lab>(((Course) it.next()).getLabs());
        }

        return labs;
    }

    @Override
    public Lab getLab(Lab lab) {
        Session session = Connection.getConnection();
        Criteria cr = session.createCriteria(Lab.class);
        cr.add(Restrictions.eq("id", lab.getId()));
        lab = (Lab) cr.uniqueResult();

        return lab;
    }


    public void insertLab(Lab lab) {
       
         Session session = Connection.getConnection();
        session.beginTransaction();
        session.persist(lab);
        session.getTransaction().commit();
        System.out.println("data inserted"); 
    }

    @Override
    public void updateLab(Lab lab) {
        Session session = Connection.getConnection();
        session.beginTransaction();
        session.update(lab);
        session.getTransaction().commit();
    }
}
