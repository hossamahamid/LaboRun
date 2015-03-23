/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.GroupD;
import com.laborun.entity.Intake;
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
public class GroupDaoImp implements GroupDaoInt {

    public List<GroupD> getGroups(UserD user) {
        Session session = Connection.getConnection();
        List<GroupD> groups = null;
        Criteria cr = session.createCriteria(UserD.class);
//        cr.add(Restrictions.eq("email", user.getEmail()));
        cr.add(Restrictions.eq("id", user.getId())); //Hossam's edit --> changed email to id and I think the criteria should be gotten by GroupD.class
        List results = cr.list();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            groups = new ArrayList<GroupD>(((UserD) it.next()).getGroupDs());
        }

        return groups;
    }

    public List<GroupD> getAllGroups(Intake intake) {
        Session session = Connection.getConnection();
        List<GroupD> groups = null;
        Criteria cr = session.createCriteria(Intake.class);
        cr.add(Restrictions.eq("intakeNum", intake.getIntakeNum()));
        List results = cr.list();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            groups = new ArrayList<GroupD>(((Intake) it.next()).getGroupDs());
        }

        return groups;
    }

    public boolean insertGroup(Intake intake, GroupD group) {

        
        boolean flag = true;
        Session session = Connection.getConnection();
        Criteria cr = session.createCriteria(GroupD.class);
        cr.add(Restrictions.eq("groupName",group.getGroupName()));
        List results = cr.list();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            
           flag = false;
           System.out.println("group already exists");
           break;

        }
        if(flag == true){
        session.beginTransaction();
        session.save(intake);
         group.setIntake(intake);
        session.persist(group);
        session.getTransaction().commit();
        System.out.println("data inserted");
        }
        return flag;
        
        
       
    }
}
