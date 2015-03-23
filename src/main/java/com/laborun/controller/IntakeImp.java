/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.dao.IntakeDaoImp;
import com.laborun.entity.Intake;
import java.util.List;

/**
 *
 * @author dina
 */
public class IntakeImp implements IntakeInt{

    public boolean insertIntake(Intake intake) {
     IntakeDaoImp IDI = new IntakeDaoImp();
    return IDI.insertIntake(intake);
    }

    public List<Intake> getIntakes() {
       IntakeDaoImp IDI = new IntakeDaoImp();
    return IDI.getIntakes();
    }
    
}
