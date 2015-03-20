/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.Lab;
import com.laborun.entity.Queue;
import com.laborun.entity.User;
import java.util.List;

/**
 *
 * @author dina
 */
public interface QueueDaoInt {
    public void addNewRequest(User user,String queueType,Queue queue); // add new request 
    public void removeFromQueue(User user,String queueType); // remove sent request
    public List<User> getTraineeInQueue(Queue queue); // get all trainees in the course
}
