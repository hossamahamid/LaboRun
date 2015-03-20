/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author dina
 */
/********** singlton *************/
public class Connection {
 
    private static Session connection = null;
    
    private Connection(){
        
    }
    
    public static Session getConnection(){
		if (connection == null) {
                    
                SessionFactory  sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
                connection = sessionFactory.openSession();
		}
		return connection;
	}
    
}
