/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.entity.Department;
import java.util.List;

/**
 *
 * @author dina
 */
public interface DepartmentInt {
 public boolean insertDepartment(Department department);   
 public List<Department> getDepartments();
}
