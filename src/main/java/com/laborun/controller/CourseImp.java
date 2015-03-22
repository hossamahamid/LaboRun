/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.entity.Course;
import com.laborun.entity.GroupD;
import java.util.List;

/**
 *
 * @author dina
 */
public class CourseImp implements CourseInt{

    public List<Course> getCourses(GroupD group) {
        CourseImp CI = new CourseImp();
        return CI.getCourses(group);
    }
    
}
