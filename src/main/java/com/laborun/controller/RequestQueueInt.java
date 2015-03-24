/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.entity.QueueD;
import com.laborun.entity.Trainee;

/**
 *
 * @author dina
 */
public interface RequestQueueInt {
     public void insertTraineeInQueue(Trainee trainee , QueueD queue);
}
