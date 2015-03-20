/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Course;
import com.laborun.entity.Group;
import com.laborun.entity.Lab;
import com.laborun.entity.User;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author dina
 */
public class mainClass {
    public static void main(String[] args) {
       /* LoginDaoImp LDI = new LoginDaoImp();
        GroupDaoImp GDI = new GroupDaoImp();
       List<Group> g;
              
        User user = new User();
        user.setEmail("dina");
        g = GDI.getGroups(user);
        Iterator it = g.iterator();
        while (it.hasNext()) {
          System.out.println(((Group) it.next()).getGroupName());
        }
     */   
        /*
     CourseDaoImp CDI = new CourseDaoImp();
       List<Course> c;
              
        User user = new User();
        user.setEmail("dina");
        Group g = new Group();
        g.setGroupName("first");
        c = CDI.getCourses(g);
        Iterator it = c.iterator();
        while (it.hasNext()) {
          System.out.println(((Course) it.next()).getCourseName());
        } */
        
     LabDaoImp LDI = new LabDaoImp();
       List<Lab> l;
              
        User user = new User();
        user.setEmail("dina");
        Course course = new Course();
        course.setCourseName("java");
        l = LDI.getLabs(course);
        Iterator it = l.iterator();
        while (it.hasNext()) {
          System.out.println(((Lab)it.next()).getLabName());
        }    
    }
}
