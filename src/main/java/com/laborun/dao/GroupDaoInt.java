/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Group;
import com.laborun.entity.User;
import java.util.List;

/**
 *
 * @author dina
 */
public interface GroupDaoInt {
    public List<Group> getGroups(User user);   // this method will get all groups assigned to a user
    // this user can be staff member or trainee
}
