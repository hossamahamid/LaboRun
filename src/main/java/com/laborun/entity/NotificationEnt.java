/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.entity;

/**
 *
 * @author taher
 */
public class NotificationEnt {

    String msg="";
    int staffId;
    int traineeId;
    int seen=0;

    public int getSeen() {
        return seen;
    }

    public void setSeen(int seen) {
        this.seen = seen;
    }
    
    
    public String getMsg() {
        return msg;
    }

    public int getStaffId() {
        return staffId;
    }

    public int getTraineeId() {
        return traineeId;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }
    
    
}
