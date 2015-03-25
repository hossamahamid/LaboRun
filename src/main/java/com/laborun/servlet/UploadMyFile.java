/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.servlet;

import com.laborun.dao.AssignmentDaoImp;
import com.laborun.dao.AssignmentDaoInt;
import com.laborun.entity.AssignmentFiles;
import com.oreilly.servlet.MultipartRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author ZamZam
 */
public class UploadMyFile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
//        System.out.println(request.getParameter("myfile"));
        if (ServletFileUpload.isMultipartContent(request)) {
            System.out.println("radwa");
            MultipartRequest m = new MultipartRequest(request, "E:\\ITI Work\\Projects\\LaboRunEtc\\New folder");
          
            Path path = Paths.get("E:\\ITI Work\\Projects\\LaboRunEtc\\sad.txt");
            byte[] array = Files.readAllBytes(path);
            System.out.println(array.length);
            AssignmentFiles assignment = new AssignmentFiles();
            assignment.setUploadFile(array);
            assignment.setUploadDate(new Date());
            
            AssignmentDaoInt upload = new AssignmentDaoImp();
            upload.uploadAssignment(assignment);
            
//           response.sendRedirect("http://localhost:8082/trainee/buttons.jsp");
        }
    }

}
