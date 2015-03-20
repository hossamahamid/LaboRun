package com.laborun.controller;

import com.laborun.entity.Queue;

/**
 * Created by Rainfall on 3/19/2015.
 */
public interface QueueInt {
    public boolean requestQueue(Queue queue);
    public boolean removeFromQueue(Queue queue);
}
