/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.dao.CourseDaoImp;
import com.laborun.entity.Course;
import com.laborun.entity.GroupD;
import com.laborun.entity.UserD;

import java.util.List;

/**
 *
 * @author dina
 */
public class CourseImp implements CourseInt{

    public List<Course> getCourses(GroupD group){
        CourseDaoImp courseDao = new CourseDaoImp();
        return courseDao.getCourses(group);
    }

}
