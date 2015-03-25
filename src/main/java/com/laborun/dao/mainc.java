/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.AssignmentFiles;
import com.laborun.entity.Lab;
import com.laborun.entity.QueueD;
import com.laborun.entity.Trainee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dina
 */
public class mainc {
    public static void main(String[] args) {
      QueueDaoImp QDI = new QueueDaoImp();
      QueueD q = new QueueD();
      q.setId(3);
     List <Integer>  t= QDI.getTraineeInQueue(q);

       Iterator it = t.iterator();
        
        while (it.hasNext()) {
              
            System.out.println(((Integer)it.next()));
        }

    }
}
