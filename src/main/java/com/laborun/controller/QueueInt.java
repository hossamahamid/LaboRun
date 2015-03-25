package com.laborun.controller;

import com.laborun.entity.QueueD;
import com.laborun.entity.TraineeInQueue;
import com.laborun.entity.Trainee;
import com.laborun.entity.UserD;
import java.util.List;
import java.util.Set;

/**
 * Created by Rainfall on 3/19/2015.
 */
public interface QueueInt {
    public boolean requestQueue(QueueD queue); // trainee requests to be added to the group 
    // this method will check if the trainee is already added to the queue or not
    // if the trainee is added it will true
    // if the trainee is already on the queue it will return false
    public void removeFromQueue(Trainee trainee,QueueD queue);
    // trainee will choose to remove his request from the queue
    
      public List<Integer> getTraineeInQueue(QueueD queue);

    public void setTraineeInQueue(QueueD queue, Set<TraineeInQueue> traineesInQueue);
}
