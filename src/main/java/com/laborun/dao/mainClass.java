/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.User;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author dina
 */
public class mainClass {
    public static void main(String[] args) {
        LoginDaoImp LDI = new LoginDaoImp();
      
       
              
        User user = new User();
        
        LDI.getUserInfo(user);
        LDI.getUserType(user);
    }
}
