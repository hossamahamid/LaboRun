package com.laborun.controller;

import com.laborun.entity.Admin;
import com.laborun.entity.Staff;
import com.laborun.entity.Trainee;
import com.laborun.entity.UserD;

/**
 * Created by Rainfall on 3/19/2015.
 */
public class UserFactory {

    public static UserD getUser(String userType) {
        if (userType.equals("trainee"))
            return new Trainee();
        else if (userType.equals("staff"))
            return new Staff();
        else if (userType.equals("admin"))
            return new Admin();

        return null;
    }
}
