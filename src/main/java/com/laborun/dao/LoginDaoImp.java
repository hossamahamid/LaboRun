/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

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

    public User getUserInfo(User user) {
        Session session = Connection.getConnection();
        System.out.println("inside getUserData");
        return null;
    }

}
