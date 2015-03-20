package com.laborun.view;

import com.laborun.controller.LoginImp;
import com.laborun.controller.loginInt;
import com.laborun.entity.Admin;
import com.laborun.entity.Staff;
import com.laborun.entity.Trainee;
import com.laborun.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Rainfall on 3/20/2015.
 */
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Gets the request parameters email and password
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        //Check the login info, if valid return the user info
        loginInt loginController = new LoginImp();
        loginController.signIn(user);

        //Saves the session and redirect to the correct role pages
        if (user == null)
            response.sendRedirect("login.html");
        else {
            HttpSession session = request.getSession(true);
            session.setAttribute("user", user);

            if (user instanceof Trainee)
                response.sendRedirect("index.html");
            else if (user instanceof Staff)
                response.sendRedirect("index.html");
            else if (user instanceof Admin)
                response.sendRedirect("index.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
