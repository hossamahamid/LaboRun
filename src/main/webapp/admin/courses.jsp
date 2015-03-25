<%-- 
    Document   : courses
    Created on : Mar 20, 2015, 11:44:28 PM
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
        <jsp:include page="adminHeader.jsp"/>
        <section id="main-content">
            <section class="wrapper">
                <h3><i class="fa fa-angle-right"></i> Courses</h3>
                <div class="row mt">
                    <div class="col-lg-12">
                        <div class="panel-heading">

                            <h4 align="right"><a href="addCourse.jsp"><i class="fa fa-angle-right"></i>Add Course</a></h4>

                        </div>

                        <div class="content-panel">
                            <table class="table table-bordered table-striped table-condensed">
                                <thead>
                                    <tr>
                                        <th>Course Name</th>
                                        <th>Course start Date</th>
                                        <th>Course End Date</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td><a href="course.jsp?name=crs1">course1</a></td>
                                        <td>22/04/2015</td>
                                        <td>30/06/2015</td>
                                    </tr>
                                    <tr>
                                        <td><a href="course.jsp?name=crs2">course2</a></td>
                                        <td>22/04/2015</td>
                                        <td>31/06/2015</td>
                                    </tr>                                   
                                </tbody>
                            </table>
                            <jsp:include page="adminFooter.html"/>

                            </body>
                            </html>
