/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.User;

/**
 *
 * @author dina
 */
public interface LoginDaoInt {
 
    public User getUserType(User user); // this method will return object from user that contains all user's data
    public User getUserInfo(User user); // this method will check role and    
}
