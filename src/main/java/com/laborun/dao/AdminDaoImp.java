/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Admin;
import org.hibernate.Session;

/**
 *
 * @author dina
 */
public class AdminDaoImp implements AdminDaoInt{

    public void insertAdminData(Admin admin) {
        Session session = Connection.getConnection();
        session.beginTransaction();
        session.persist(admin);
        session.getTransaction().commit();
        System.out.println("data inserted"); 
    }
    
}
