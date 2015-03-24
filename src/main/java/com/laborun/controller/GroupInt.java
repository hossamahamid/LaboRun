package com.laborun.controller;

import com.laborun.entity.GroupD;
import com.laborun.entity.Intake;
import com.laborun.entity.UserD;
import java.util.List;

/**
 * Created by Rainfall on 3/19/2015.
 */
public interface GroupInt {
    
    public List<GroupD> getGroups(UserD user);
    public boolean insertNewGroup(GroupD group);
}
