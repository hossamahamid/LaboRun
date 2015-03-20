package com.laborun.controller;

import com.laborun.entity.Group;
import com.laborun.entity.User;
import java.util.List;

/**
 * Created by Rainfall on 3/19/2015.
 */
public interface GroupInt {
    public List<Group> getGroups(User user);
}
