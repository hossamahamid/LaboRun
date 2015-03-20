package com.laborun.controller;

import com.laborun.entity.Queue;

/**
 * Created by Rainfall on 3/19/2015.
 */
public interface QueueInt {
    public boolean requestQueue(Queue queue); // trainee requests to be added to the group 
    // this method will check if the trainee is already added to the queue or not
    // if the trainee is added it will true
    // if the trainee is already on the queue it will return false
    public boolean removeFromQueue(Queue queue);
    // trainee will choose to remove his request from the queue
}
