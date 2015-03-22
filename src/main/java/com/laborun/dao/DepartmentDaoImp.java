/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Department;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author dina
 */
public class DepartmentDaoImp implements DepartmentDaoInt{

    public boolean insertDepartment(Department department) {
        boolean flag = true;
        Session session = Connection.getConnection();
        Criteria cr = session.createCriteria(Department.class);
        cr.add(Restrictions.eq("departmentName",department.getDepartmentName()));
        List results = cr.list();
        Iterator it = results.iterator();
        while (it.hasNext()) {
            
           flag = false;
           System.out.println("department already exists");
           break;

        }
        if(flag == true){
        session.beginTransaction();
        session.persist(department);
        session.getTransaction().commit();
        System.out.println("data inserted");
        }
        return flag;
        
    }
    
}
