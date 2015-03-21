/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Staff;
import org.hibernate.Session;

/**
 *
 * @author dina
 */
public class StaffDaoImp implements StaffDaoInt{

    public void insertStaffData(Staff staff) {
        staff.setRole("staff");
         Session session = Connection.getConnection();
        session.beginTransaction();
        session.persist(staff);
        session.getTransaction().commit();
        System.out.println("data inserted"); 
    }
    
}
