package com.laborun.entity;
// Generated Mar 21, 2015 3:25:42 PM by Hibernate Tools 4.3.1



/**
 * TraineeInQueue generated by hbm2java
 */
public class TraineeInQueue  implements java.io.Serializable {


     private TraineeInQueueId id;
     private QueueD queueD;
     private Trainee trainee;
     private int orderNum;

    public TraineeInQueue() {
    }

    public TraineeInQueue(TraineeInQueueId id, QueueD queueD, Trainee trainee, int orderNum) {
       this.id = id;
       this.queueD = queueD;
       this.trainee = trainee;
       this.orderNum = orderNum;
    }
   
    public TraineeInQueueId getId() {
        return this.id;
    }
    
    public void setId(TraineeInQueueId id) {
        this.id = id;
    }
    public QueueD getQueueD() {
        return this.queueD;
    }
    
    public void setQueueD(QueueD queueD) {
        this.queueD = queueD;
    }
    public Trainee getTrainee() {
        return this.trainee;
    }
    
    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }
    public int getOrderNum() {
        return this.orderNum;
    }
    
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }




}


