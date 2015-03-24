/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.dao.LabDaoImp;
import com.laborun.dao.LabDaoInt;
import com.laborun.entity.Course;
import com.laborun.entity.Lab;
import java.util.List;

/**
 *
 * @author dina
 */
public class LabImp implements LabInt{

    public List<Lab> getLabs(Course course) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insertLab(Lab lab) {
        LabDaoInt LDI = new LabDaoImp();
        LDI.insertLab(lab);
    }
    
}
