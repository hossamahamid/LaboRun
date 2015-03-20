/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Admin;
import com.laborun.entity.Staff;
import com.laborun.entity.Trainee;
import com.laborun.entity.User;
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
public class LoginDaoImp implements LoginDaoInt {

    public User getUserType(User user) {
        Session session = Connection.getConnection();
        
        User user_data = null;
        Criteria cr = session.createCriteria(User.class);
        cr.add(Restrictions.eq("email", user.getEmail())).add(Restrictions.eq("password", user.getPassword()));
        List results = cr.list();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            user_data = (User) it.next();
           

        }

        return user_data;

    }

    public Trainee getTraineeInfo(User user) {
        Session session = Connection.getConnection();
        Trainee traineeData = null;
        Criteria cr = session.createCriteria(Trainee.class);
        cr.add(Restrictions.eq("email", user.getEmail())).add(Restrictions.eq("password", user.getPassword()));
        List results = cr.list();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            traineeData = (Trainee) it.next();
           

        }
        
        return traineeData;
    }

    public Staff getStaffInfo(User user) {
       Session session = Connection.getConnection();
        Staff staffData = null;
        Criteria cr = session.createCriteria(Staff.class);
        cr.add(Restrictions.eq("email", user.getEmail())).add(Restrictions.eq("password", user.getPassword()));
        List results = cr.list();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            staffData = (Staff) it.next();
           

        }
        
        return staffData;
      
    }

    public Admin getAdminInfo(User user) {
        Session session = Connection.getConnection();
        Admin adminData = null;
        Criteria cr = session.createCriteria(Admin.class);
        cr.add(Restrictions.eq("email", user.getEmail())).add(Restrictions.eq("password", user.getPassword()));
        List results = cr.list();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            adminData = (Admin) it.next();
           
        }
        return adminData;
    }

    
    

}
