/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Course;
import com.laborun.entity.Group;
import java.util.List;

/**
 *
 * @author dina
 */
public interface CourseDaoInt {
    
    public List<Course> getCourses(Group group); // get all courses assigned to certain group
}
