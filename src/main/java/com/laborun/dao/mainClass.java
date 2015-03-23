///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.laborun.dao;
//
//import com.laborun.entity.Admin;
//import com.laborun.entity.AssignmentFiles;
//import com.laborun.entity.Course;
//import com.laborun.entity.Group;
//import com.laborun.entity.Intake;
//import com.laborun.entity.Lab;
//import com.laborun.entity.Staff;
//import com.laborun.entity.Trainee;
//import com.laborun.entity.User;
//import java.io.File;
//import java.io.FileInputStream;
//import java.net.URL;
//import java.sql.Date;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
///**
// *
// * @author dina
// */
//
//public class mainClass {
//    public static void main(String[] args) {
//       /* LoginDaoImp LDI = new LoginDaoImp();
//        GroupDaoImp GDI = new GroupDaoImp();
//       List<Group> g;
//
//        User user = new User();
//        user.setEmail("dina");
//        g = GDI.getGroups(user);
//        Iterator it = g.iterator();
//        while (it.hasNext()) {
//          System.out.println(((Group) it.next()).getGroupName());
//        }
//     */
//        /*
//     CourseDaoImp CDI = new CourseDaoImp();
//       List<Course> c;
//
//        User user = new User();
//        user.setEmail("dina");
//        Group g = new Group();
//        g.setGroupName("first");
//        c = CDI.getCourses(g);
//        Iterator it = c.iterator();
//        while (it.hasNext()) {
//          System.out.println(((Course) it.next()).getCourseName());
//        } */
//        /*
//     LabDaoImp LDI = new LabDaoImp();
//       List<Lab> l;
//
//        User user = new User();
//        user.setEmail("dina");
//        Course course = new Course();
//        course.setCourseName("java");
//        l = LDI.getLabs(course);
//        Iterator it = l.iterator();
//        while (it.hasNext()) {
//          System.out.println(((Lab)it.next()).getLabName());
//        } */
//        /*
//        AssignmentDaoImp ADI = new AssignmentDaoImp();
//        AssignmentFiles AF = new AssignmentFiles();
//
//        File file = new File("D:\\pictures\\New folder (2)\\1.JPG");
//        byte[] bFile = new byte[(int) file.length()];
//
//        try {
//	     FileInputStream fileInputStream = new FileInputStream(file);
//	     //convert file into array of bytes
//	     fileInputStream.read(bFile);
//	     fileInputStream.close();
//        } catch (Exception e) {
//	     e.printStackTrace();
//        }
//        AF.setUploadFile(bFile);
//        ADI.uploadAssignment(AF);*/
//        /*
//        LoginDaoImp LDI = new LoginDaoImp();
//        User user = new User();
//        user.setEmail("dina");
//        user.setPassword("1234");
//
//        User user2 = new User();
//        user2.setEmail("dalia");
//        user2.setPassword("1234");
//
//        User user3 = new User();
//        user3.setEmail("enas");
//        user3.setPassword("1234");
//        Trainee t =LDI.getTraineeInfo(user2);
//        Staff s = LDI.getStaffInfo(user3);
//        Admin a= LDI.getAdminInfo(user);
//        System.out.println(t.getName());
//        System.out.println(s.getName());
//        System.out.println(a.getName());*/
//
//
//        Trainee t = new Trainee();
//        t.setName("ahmed");
//        t.setEmail("ahmed");
//        t.setPassword("1234");
//        t.setPhoneNumber("11111");
//
//
//        Staff s = new Staff();
//        s.setName("ahmed2");
//        s.setEmail("ahmed2");
//        s.setPassword("1234");
//        s.setPhoneNumber("222222");
//
//        /*Admin a = new Admin();
//        a.setName("ahmed3");
//        a.setEmail("ahmed3");
//        a.setPassword("1234");
//        a.setPhoneNumber("55555");
//        */
//        TraineeDaoImp TDI = new  TraineeDaoImp();
//        TDI.insertTraineeData(t);
//        StaffDaoImp SDI = new StaffDaoImp();
//        SDI.insertStaffData(s);
//
//
//      /*  AdminDaoImp ADI = new AdminDaoImp();
//        ADI.insertAdminData(a);*/
//        /*
//        Intake intake1 = new Intake();
//        intake1.setIntakeNum(20);
//        IntakeDaoImp IDI = new IntakeDaoImp();
//        IDI.insertIntake(intake1);*//*
//        IntakeDaoImp IDI = new IntakeDaoImp();
//        List<Intake> intakes = IDI.getIntakes();
//
//        Iterator it = intakes.iterator();
//        while (it.hasNext()) {
//          System.out.println(((Intake)it.next()).getIntakeNum());
//        }*/
//        GroupDaoImp GDI = new GroupDaoImp();
//        Intake intake = new Intake();
//        intake.setIntakeNum(10);
//        Group group = new Group();
//        group.setGroupName("group1");
//
//        GDI.insertGroup(intake,group);
//
//
////        AdminDaoImp ADI = new AdminDaoImp();
////        ADI.insertAdminData(a);
//
//    }
//}
//
