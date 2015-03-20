/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.User;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author dina
 */
public class LoginDaoImp implements LoginDaoInt{

    public User getUserType(User user) {
       /* String hql = "From User where ";
        Query query = session.createQuery(hql);
        List results = query.list();
        
        System.out.println("");
        System.out.println("first req");
       System.out.println("------------------");
        for (int i=0; i<results.size(); i++){
        Object row = (Object) results.get(i);

            
   System.out.println((String)(row));
   
   
   
}*/
        return null;
    }

    public User getUserInfo(User user) {
         System.out.println("inside getUserData");
          return null;
    }
    
}
