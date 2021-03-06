package com.laborun.entity;
// Generated Mar 21, 2015 3:25:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Trainee generated by hbm2java
 */
public class Trainee extends UserD implements java.io.Serializable {


     private Integer id;
     private Intake intake;
     private Set assignmentFileses = new HashSet(0);
     private Set traineeInQueues = new HashSet(0);

    public Trainee() {
    }

	
    public Trainee(Intake intake) {
        this.intake = intake;
    }
    public Trainee(Intake intake, Set assignmentFileses, Set traineeInQueues) {
       this.intake = intake;
       this.assignmentFileses = assignmentFileses;
       this.traineeInQueues = traineeInQueues;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Intake getIntake() {
        return this.intake;
    }
    
    public void setIntake(Intake intake) {
        this.intake = intake;
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


