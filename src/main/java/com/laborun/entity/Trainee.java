package com.laborun.entity;
// Generated Mar 19, 2015 10:40:45 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Trainee generated by hbm2java
 */
public class Trainee  implements java.io.Serializable {


     private int id;
     private Intake intake;
     private User user;
     private Set assignmentFileses = new HashSet(0);
     private Set traineeInQueues = new HashSet(0);

    public Trainee() {
    }

	
    public Trainee(Intake intake, User user) {
        this.intake = intake;
        this.user = user;
    }
    public Trainee(Intake intake, User user, Set assignmentFileses, Set traineeInQueues) {
       this.intake = intake;
       this.user = user;
       this.assignmentFileses = assignmentFileses;
       this.traineeInQueues = traineeInQueues;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Intake getIntake() {
        return this.intake;
    }
    
    public void setIntake(Intake intake) {
        this.intake = intake;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Set getAssignmentFileses() {
        return this.assignmentFileses;
    }
    
    public void setAssignmentFileses(Set assignmentFileses) {
        this.assignmentFileses = assignmentFileses;
    }
    public Set getTraineeInQueues() {
        return this.traineeInQueues;
    }
    
    public void setTraineeInQueues(Set traineeInQueues) {
        this.traineeInQueues = traineeInQueues;
    }




}


