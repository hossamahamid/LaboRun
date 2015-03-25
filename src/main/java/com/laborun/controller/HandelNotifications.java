/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import antlr.collections.impl.Vector;
import com.laborun.entity.NotificationEnt;
import java.util.ArrayList;

/**
 *
 * @author taher
 */
public class HandelNotifications {

    public ArrayList<NotificationEnt> allNotification;

    public HandelNotifications() {
        this.allNotification = new ArrayList<NotificationEnt>();
        NotificationEnt note1 = new NotificationEnt();
        note1.setMsg("message to user 12");
        note1.setTraineeId(12);
        note1.setSeen(0);
        allNotification.add(note1);
         NotificationEnt note2 = new NotificationEnt();
        note2.setMsg("message2 to user 12");
        note2.setTraineeId(12);
        note2.setSeen(0);
        allNotification.add(note2);
    }
    
    // supposed that every 5 seconds the trainee will not get more than one notification.
    public String checkNew(int userID) {
        
        for (int i = allNotification.size()-1 ; i >=0 ; i--) {
            NotificationEnt note =allNotification.get(i); 
            if ((note.getTraineeId() == userID)&&(note.getSeen()==0)) {
                allNotification.get(i).setSeen(1);
                System.out.println("setSeen = "+allNotification.get(i).getSeen());
                return note.getMsg();
            }
            else{
                System.out.println("seen = 1");
                return null;
            }
        }
        return null;
    }
}
