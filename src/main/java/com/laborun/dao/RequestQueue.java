/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.dao;

import com.laborun.entity.QueueD;
import com.laborun.entity.Trainee;

/**
 *
 * @author dina
 */
public interface RequestQueue {
    public void insertTraineeInQueue(Trainee trainee , QueueD queue);
}
