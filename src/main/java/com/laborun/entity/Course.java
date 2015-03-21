package com.laborun.entity;
// Generated Mar 21, 2015 3:25:42 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Course generated by hbm2java
 */
public class Course  implements java.io.Serializable {


     private int id;
     private String courseName;
     private Date courseStartDate;
     private Date courseEndDate;
     private Set departments = new HashSet(0);
     private Set labs = new HashSet(0);
     private Set staffs = new HashSet(0);
     private Set groupDs = new HashSet(0);

    public Course() {
    }

	
    public Course(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }
    public Course(int id, String courseName, Date courseStartDate, Date courseEndDate, Set departments, Set labs, Set staffs, Set groupDs) {
       this.id = id;
       this.courseName = courseName;
       this.courseStartDate = courseStartDate;
       this.courseEndDate = courseEndDate;
       this.departments = departments;
       this.labs = labs;
       this.staffs = staffs;
       this.groupDs = groupDs;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCourseName() {
        return this.courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public Date getCourseStartDate() {
        return this.courseStartDate;
    }
    
    public void setCourseStartDate(Date courseStartDate) {
        this.courseStartDate = courseStartDate;
    }
    public Date getCourseEndDate() {
        return this.courseEndDate;
    }
    
    public void setCourseEndDate(Date courseEndDate) {
        this.courseEndDate = courseEndDate;
    }
    public Set getDepartments() {
        return this.departments;
    }
    
    public void setDepartments(Set departments) {
        this.departments = departments;
    }
    public Set getLabs() {
        return this.labs;
    }
    
    public void setLabs(Set labs) {
        this.labs = labs;
    }
    public Set getStaffs() {
        return this.staffs;
    }
    
    public void setStaffs(Set staffs) {
        this.staffs = staffs;
    }
    public Set getGroupDs() {
        return this.groupDs;
    }
    
    public void setGroupDs(Set groupDs) {
        this.groupDs = groupDs;
    }




}


