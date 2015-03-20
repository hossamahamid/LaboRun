package com.laborun.controller;

import com.laborun.entity.Admin;
import com.laborun.entity.Staff;
import com.laborun.entity.Trainee;
import com.laborun.entity.User;

/**
 * Created by Rainfall on 3/19/2015.
 */
public class UserFactory {

    public static User getUser(String userType) {
        if (userType.equals("Trainee"))
            return new Trainee();
        else if (userType.equals("Staff"))
            return new Staff();
        else if (userType.equals("Admin"))
            return new Admin();

        return null;
    }
}
