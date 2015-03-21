/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.AssignmentFiles;
import com.laborun.entity.Lab;
import com.laborun.entity.User;
import java.util.List;

/**
 *
 * @author dina
 */
public interface AssignmentDaoInt {
    
    public void uploadAssignment(AssignmentFiles assignmentFiles);
    public List<AssignmentFiles> getAssignments(Lab lab);
    
}
