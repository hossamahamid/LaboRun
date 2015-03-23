/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.dao.StaffDaoImp;
import com.laborun.entity.Staff;

/**
 *
 * @author dina
 */
public class StaffImp implements StaffInt{

    public void insertStaffData(Staff staff) {
        StaffDaoImp SDI = new StaffDaoImp();
        SDI.insertStaffData(staff);
    }
    
}
