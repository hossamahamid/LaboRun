package com.laborun.controller;

import com.laborun.entity.UserD;

/**
 * Created by Rainfall on 3/19/2015.
 */
public interface loginInt {
    public UserD signIn(UserD user);// calls getUserType to return User type, calls UserFactory to create the user type, calls getUserInfo to return the user info
    public UserD getUserType(UserD user); //return User with role attribute
    public UserD getUserInfo(UserD user); //return the user type; admin, staff, trainee
}
