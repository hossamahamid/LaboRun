/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Course;
import com.laborun.entity.GroupD;
import com.laborun.entity.UserD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author dina
 */
public class CourseDaoImp implements CourseDaoInt{

    public List<Course> getCourses(GroupD group) {
        Session session = Connection.getConnection();
        List<Course> courses = null;
        Criteria cr = session.createCriteria(GroupD.class);
        cr.add(Restrictions.eq("groupName", group.getGroupName()));
        List results = cr.list();
        Iterator it = results.iterator();
        
        while (it.hasNext()) {
            courses = new ArrayList<Course>(((GroupD) it.next()).getCourses());
        }

        return courses;
    }
    
}
