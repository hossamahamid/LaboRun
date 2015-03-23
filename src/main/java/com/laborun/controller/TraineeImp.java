/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.dao.TraineeDaoImp;
import com.laborun.entity.Intake;
import com.laborun.entity.Trainee;
import java.util.List;

/**
 *
 * @author dina
 */
public class TraineeImp implements TraineeInt{
    public boolean insertTraineeData(Trainee trainee){
        TraineeDaoImp TDI = new TraineeDaoImp();
       return TDI.insertTraineeData(trainee);
       
    }

    public List<Trainee> getTrainees(Intake intake) {
       TraineeDaoImp TDI = new TraineeDaoImp();
       return TDI.getTrainees(intake);
    }
}
