/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Lab;
import com.laborun.entity.QueueD;
import com.laborun.entity.Trainee;
import com.laborun.entity.UserD;
import java.util.List;

/**
 *
 * @author dina
 */
public interface QueueDaoInt {
    public void addNewRequest(QueueD queue); // add new request 
    public void removeFromQueue(Trainee trainee,QueueD queue); // remove sent request
    public List<UserD> getTraineeInQueue(QueueD queue); // get all trainees in the course
}
