/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Group;
import com.laborun.entity.Intake;
import com.laborun.entity.User;
import java.util.List;

/**
 *
 * @author dina
 */
public interface GroupDaoInt {
    public List<Group> getGroups(User user);   // this method will get all groups assigned to a user
    // this user can be staff member or trainee
    
    public List<Group> getAllGroups(Intake intake); // this method will get all groups assigned to certain intake 
    public void insertGroup(Intake intake,Group group); // insert new group into certain intake
    
}
