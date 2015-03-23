<%-- 
    Document   : instructors
    Created on : Mar 20, 2015, 11:54:43 PM
    Author     : taher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LABORUN</title>
    </head>
    <body>
        <jsp:include page="adminHeader.html"/>
        <section id="main-content">
            <section class="wrapper">
                <h3><i class="fa fa-angle-right"></i> Instructors</h3>
                <div class="row mt">
                    <div class="col-lg-12">
                        <div class="panel-heading">

                            <h4 align="right"><a href="/LaboRun/NewStaff"><i class="fa fa-angle-right"></i>Add Instructor</a></h4>

                        </div>

                        <div class="content-panel">
                            <table class="table table-bordered table-striped table-condensed">
                                <thead>
                                    <tr>
                                        <th>Instructor Name</th>
                                        <th>Department</th>
                                        <th>E-mail</th>
                                        <th>Address</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td><a href="instructor.jsp?name=ahmed">ahmed</a></td>
                                        <td>dept1</td>
                                        <td>test@yahoo.com</td>
                                        <td>address 1</td>

                                    </tr>
                                    <tr>
                                        <td><a href="instructor.jsp?name=hassan">hassan</a></td>
                                        <td>dept1</td>
                                        <td>test@yahoo.com</td>
                                        <td>address 2</td>

                                    </tr>                                  
                                </tbody>
                            </table>
                            <jsp:include page="adminFooter.html"/>
                            </body>
                            </html>
