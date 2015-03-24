/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.dao.GroupDaoImp;
import com.laborun.dao.GroupDaoInt;
import com.laborun.entity.GroupD;
import com.laborun.entity.Intake;
import com.laborun.entity.UserD;

import java.util.List;

/**
 *
 * @author dina
 */
public class GroupImp implements GroupInt{

    public List<GroupD> getGroups(UserD user) {
        GroupDaoInt groupDao = new GroupDaoImp();
        return (groupDao.getGroups(user));
    }

    public boolean insertNewGroup(GroupD group) {
        GroupDaoImp GDI = new GroupDaoImp();
       return GDI.insertGroup(group);
    }
    
}
