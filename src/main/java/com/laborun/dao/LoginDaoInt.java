/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Admin;
import com.laborun.entity.Staff;
import com.laborun.entity.Trainee;
import com.laborun.entity.UserD;

/**
 *
 * @author dina
 */
public interface LoginDaoInt {
 
    public UserD getUserType(UserD user); // this method will return object from user that contains all user's data
    public Trainee getTraineeInfo(UserD user);   
    public Staff getStaffInfo(UserD user);  
    public Admin getAdminInfo(UserD user);  
}
