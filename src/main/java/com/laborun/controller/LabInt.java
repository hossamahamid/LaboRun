/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.entity.Course;
import com.laborun.entity.Lab;
import java.util.List;

/**
 *
 * @author dina
 */
public interface LabInt {
    public List<Lab> getLabs(Course course); // get all labs assigned to certain course
    public Lab getLab(Lab lab); //get specific lab
    public void insertLab(Lab lab);
}
