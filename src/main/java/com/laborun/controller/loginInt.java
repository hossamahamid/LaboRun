package com.laborun.controller;

/**
 * Created by Rainfall on 3/19/2015.
 */
public interface loginInt {
    public User signIn(User user);// calls getUserType to return User type, calls UserFactory to create the user type, calls getUserInfo to return the user info
    public User getUserType(User user); //return User with role attribute
    public User getUserInfo(User user); //return the user type; admin, staff, trainee
}
