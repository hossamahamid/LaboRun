package com.laborun.servlet;

import com.laborun.controller.GroupImp;
import com.laborun.controller.GroupInt;
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
 * Created by Rainfall on 3/22/2015.
 */
public class GroupsView extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserD user = new UserD();
        user.setId((Integer) request.getSession().getAttribute("userId"));

        GroupInt groupController = new GroupImp();
        List<GroupD> groups = groupController.getGroups(user);
        request.setAttribute("groups", groups);

        for (GroupD my : groups)
            System.out.println(my.getGroupName());
        RequestDispatcher dispatcher = request.getRequestDispatcher("groups.jsp");
        dispatcher.forward(request, response);
    }
}
