/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.dao.DepartmentDaoImp;
import com.laborun.entity.Department;

/**
 *
 * @author dina
 */
public class DepartmentImp implements DepartmentInt{

    public boolean insertDepartment(Department department) {
        DepartmentDaoImp DDI = new DepartmentDaoImp();
       return DDI.insertDepartment(department);
    }
    
}
