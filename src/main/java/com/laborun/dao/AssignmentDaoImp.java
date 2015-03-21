/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.AssignmentFiles;
import com.laborun.entity.Course;
import com.laborun.entity.GroupD;
import com.laborun.entity.Lab;
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
public class AssignmentDaoImp implements AssignmentDaoInt{

    public void uploadAssignment(AssignmentFiles assignmentFiles) {
        Session session = Connection.getConnection();
        session.beginTransaction();
        session.persist(assignmentFiles);
        session.getTransaction().commit();
        System.out.println("data inserted"); 
    }


    public List<AssignmentFiles> getAssignments(Lab lab) {
        Session session = Connection.getConnection();
        List<AssignmentFiles> assignmentFiles = null;
        Criteria cr = session.createCriteria(Lab.class);
        cr.add(Restrictions.eq("labName", lab.getAssignmentFileses()));
        List results = cr.list();
        Iterator it = results.iterator();
        
        while (it.hasNext()) {
            assignmentFiles = new ArrayList<AssignmentFiles>(((Lab) it.next()).getAssignmentFileses());
        }

        return assignmentFiles;
    }
    
}
