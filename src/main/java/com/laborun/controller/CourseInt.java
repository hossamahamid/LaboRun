package com.laborun.controller;

import com.laborun.entity.Course;
import com.laborun.entity.GroupD;
import java.util.List;

/**
 * Created by Rainfall on 3/19/2015.
 */
public interface CourseInt {
    public List<Course> getCourses(GroupD group);
}
