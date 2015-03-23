//package com.laborun.servlet;
//
//import com.laborun.dao.AssignmentDaoImp;
//import com.laborun.dao.AssignmentDaoInt;
//import com.laborun.entity.AssignmentFiles;
//import com.oreilly.servlet.MultipartRequest;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Date;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
//
//public class UploadFile extends HttpServlet {
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//
//        if (ServletFileUpload.isMultipartContent(request)) {
//
//            MultipartRequest m = new MultipartRequest(request, "C:\\Users\\ZamZam\\Documents\\NetBeansProjects\\UploadFile\\web");
//           
//            Path path = Paths.get("C:\\\\Users\\\\ZamZam\\\\Documents\\\\NetBeansProjects\\\\UploadFile\\\\web\"");
//            byte[] array = Files.readAllBytes(path);
//
//            AssignmentFiles assignment = new AssignmentFiles();
//            assignment.setUploadFile(array);
//            assignment.setUploadDate(new Date());
//
//            AssignmentDaoInt upload = new AssignmentDaoImp();
//            upload.uploadAssignment(assignment);
//        }
//    }
//
//}
