package com.laborun.entity;
// Generated Mar 21, 2015 3:25:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * UserD generated by hbm2java
 */
public class UserD  implements java.io.Serializable {


     private Integer id;
     private Department department;
     private String name;
     private String phoneNumber;
     private String email;
     private String userPassword;
     private Integer age;
     private String address;
     private int active;
     private String role;
     private Set groupDs = new HashSet(0);

    public UserD() {
    }

	
    public UserD(String name, String phoneNumber, String email, String userPassword, int active) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userPassword = userPassword;
        this.active = active;
    }
    public UserD(Department department, String name, String phoneNumber, String email, String userPassword, Integer age, String address, int active, String role, Set groupDs) {
       this.department = department;
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.email = email;
       this.userPassword = userPassword;
       this.age = age;
       this.address = address;
       this.active = active;
       this.role = role;
       this.groupDs = groupDs;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public int getActive() {
        return this.active;
    }
    
    public void setActive(int active) {
        this.active = active;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    public Set getGroupDs() {
        return this.groupDs;
    }
    
    public void setGroupDs(Set groupDs) {
        this.groupDs = groupDs;
    }




}


