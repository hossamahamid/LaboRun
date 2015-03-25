/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.AssignmentFiles;
import com.laborun.entity.Lab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dina
 */
public class mainc {
    public static void main(String[] args) {
        AssignmentDaoImp ADI = new AssignmentDaoImp();
        Lab l = new Lab();
        l.setId(1);
      List <AssignmentFiles> a= ADI.getAssignments(l);
       Iterator it = a.iterator();
        
        while (it.hasNext()) {
            System.out.println("inside");
        }

    }
}
