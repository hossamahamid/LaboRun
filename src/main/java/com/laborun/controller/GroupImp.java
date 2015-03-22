/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.dao.GroupDaoImp;
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
        throw new UnsupportedOperationException("Not supported yet."); //change body of generated methods, choose Tools | Templates.
    }

    public boolean insertNewGroup(Intake intake, GroupD group) {
        GroupDaoImp GDI = new GroupDaoImp();
       return GDI.insertGroup(intake, group);
    }
    
}
