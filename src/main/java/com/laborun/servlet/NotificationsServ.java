/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.servlet;

import com.laborun.controller.HandelNotifications;
import com.laborun.entity.NotificationEnt;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author taher
 */
public class NotificationsServ extends HttpServlet {
//    ArrayList<NotificationEnt>allntes = new ArrayList<NotificationEnt>();
            ArrayList<NotificationEnt> allNotes;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        }

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            

            System.out.println("inseid the notifications servlet");
            ServletContext context = request.getSession().getServletContext();
            System.out.println("inseid the notifications servlet2");

            //////////////////////////for test/////////////////
//            NotificationEnt note1 = new NotificationEnt();
//            note1.setMsg("message to use 12");
//            note1.setTraineeId(12);
//            note1.setSeen(0);
//            
//            NotificationEnt note2 = new NotificationEnt();
//            note2.setMsg("message2 to use 12");
//            note2.setTraineeId(12);
//            note2.setSeen(0);
//            allNotes = new ArrayList<NotificationEnt>();
//            allNotes.add(note2);
//            allNotes.add(note1);
//            context.setAttribute("notifications", allNotes);
            //////////////////////////  
            System.out.println("note 1 msg from context : "+context.getAttribute("notifications"));
            
            HttpSession session = request.getSession(true);
            Integer userId = (Integer) session.getAttribute("userId");
            System.out.println("trainee Id = " + session.getAttribute("userId"));
            if (context.getAttribute("notifications") != null) {
                System.out.println("in the if cluase servlet");
                allNotes = (ArrayList) context.getAttribute("notifications");
                 //allNotes = new ArrayList<NotificationEnt>();
                //session.setAttribute("notifications", allNotes);
                //         String note = checkNew(userId);
                for (int i = allNotes.size()-1; i >= 0; i--) {
                    NotificationEnt note = allNotes.get(i);
                    if ((note.getTraineeId() == userId) && (note.getSeen() == 0)) {
                        allNotes.get(i).setSeen(1);
                        context.setAttribute("notifications", allNotes);
                        System.out.println("setSeen = " + allNotes.get(i).getSeen());
                        out.print(note.getMsg());
                    } else {
                        out.print("");
                    }
                }
            }
            else{
                System.out.println("in the else clause servlet");
                context.setAttribute("notifications", allNotes);
            }
//                out.print(note);
//            }
//            else{
//                session.setAttribute("notifications" , new ArrayList<NotificationEnt>());
//            }
//            String note = handler.checkNew(userId);
//            System.out.println("from inside the servlet: "+note);
                //         out.print(note);

//            if(note != null)
//            {
//                out.print(note);
//            }
//            else{
//                out.print("");
//            }
            }finally {
            out.close();
        }
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           // processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>
    
    
    
    

//    public String checkNew(int userID) {
//
//        for (int i = allNotification.size() - 1; i >= 0; i--) {
//            NotificationEnt note = allNotification.get(i);
//            if ((note.getTraineeId() == userID) && (note.getSeen() == 0)) {
//                allNotification.get(i).setSeen(1);
//                System.out.println("setSeen = " + allNotification.get(i).getSeen());
//                return note.getMsg();
//            } else {
//                System.out.println("seen = 1");
//                return null;
//            }
//        }
//        return null;
//    }

}
