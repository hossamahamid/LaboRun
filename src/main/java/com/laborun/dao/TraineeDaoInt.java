/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Intake;
import com.laborun.entity.Trainee;
import java.util.List;

/**
 *
 * @author dina
 */
public interface TraineeDaoInt {
    public boolean insertTraineeData(Trainee trainee);
    public List<Trainee> getTrainees(Intake intake);
}
