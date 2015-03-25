/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.*;

import java.util.List;
import java.util.Set;

/**
 *
 * @author dina
 */
public interface QueueDaoInt {
    public void addNewRequest(QueueD queue); // add new request 
    public void removeFromQueue(Trainee trainee,QueueD queue); // remove sent request
    public List<Integer> getTraineeInQueue(QueueD queue); // get all trainees in the course
    public void setTraineeInQueue(QueueD queue, Set<TraineeInQueue> traineesInQueues);
}
