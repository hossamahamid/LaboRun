/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Trainee;
import org.hibernate.Session;

/**
 *
 * @author dina
 */
public class TraineeDaoImp implements TraineeDaoInt {

    public boolean insertTraineeData(Trainee trainee) {
        trainee.setRole("trainee");

        Session session = Connection.getConnection();
        session.beginTransaction();
        session.persist(trainee);
        session.getTransaction().commit();

        System.out.println("data inserted");
        return true;
    }

}
