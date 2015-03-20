/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author dina
 */
public class LoginDaoImp implements LoginDaoInt{

    public User getUserType(User user) {
       Session session = Connection.getConnection();
        
        String hql = "From User where";
        Query query = session.createQuery(hql);
        List results = query.list();
        
        for (int i=0; i<results.size(); i++){
        Object row = (Object) results.get(i);

            
   System.out.println((String)(row));
   
   
   
}
       System.out.print("ssss");
        return null;
    }

    public User getUserInfo(User user) {
         Session session = Connection.getConnection();
         System.out.println("inside getUserData");
          return null;
    }
    
}
