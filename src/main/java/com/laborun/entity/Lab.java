package com.laborun.entity;
// Generated Mar 21, 2015 3:25:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Lab generated by hbm2java
 */
public class Lab  implements java.io.Serializable {


     private int id;
     private Course course;
     private String labName;
     private Set staffs = new HashSet(0);
     private Set assignmentFileses = new HashSet(0);
     private Set queueDs = new HashSet(0);

    public Lab() {
    }

	
    public Lab(int id, Course course) {
        this.id = id;
        this.course = course;
    }
    public Lab(int id, Course course, String labName, Set staffs, Set assignmentFileses, Set queueDs) {
       this.id = id;
       this.course = course;
       this.labName = labName;
       this.staffs = staffs;
       this.assignmentFileses = assignmentFileses;
       this.queueDs = queueDs;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public String getLabName() {
        return this.labName;
    }
    
    public void setLabName(String labName) {
        this.labName = labName;
    }
    public Set getStaffs() {
        return this.staffs;
    }
    
    public void setStaffs(Set staffs) {
        this.staffs = staffs;
    }
    public Set getAssignmentFileses() {
        return this.assignmentFileses;
    }
    
    public void setAssignmentFileses(Set assignmentFileses) {
        this.assignmentFileses = assignmentFileses;
    }
    public Set getQueueDs() {
        return this.queueDs;
    }
    
    public void setQueueDs(Set queueDs) {
        this.queueDs = queueDs;
    }




}


