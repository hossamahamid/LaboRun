/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

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
                    
//                SessionFactory  sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            Configuration configuration = new Configuration().configure();

            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();

            serviceRegistryBuilder.applySettings(configuration.getProperties());

            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            connection = sessionFactory.openSession();
		}
		return connection;
	}
    
}
