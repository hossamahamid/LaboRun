package com.laborun.servlet;

import com.laborun.controller.CourseImp;
import com.laborun.controller.CourseInt;
import com.laborun.controller.GroupImp;
import com.laborun.controller.GroupInt;
import com.laborun.entity.Course;
import com.laborun.entity.GroupD;
import com.laborun.entity.UserD;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Rainfall on 3/23/2015.
 */
public class CoursesView extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserD user = new UserD();
        user.setId((Integer) request.getSession().getAttribute("userId"));

        int gId = Integer.parseInt(request.getParameter("gid"));
        String gName = request.getParameter("gname");

        GroupD groupD = new GroupD();
        groupD.setId(gId);
        groupD.setGroupName(gName);

        CourseInt courseController = new CourseImp();
        List<Course> courses = courseController.getCourses(groupD);

        request.setAttribute("group", groupD);
        request.setAttribute("courses", courses);

        RequestDispatcher dispatcher = request.getRequestDispatcher("courses.jsp");
        dispatcher.forward(request, response);
    }
}
