<%-- 
    Document   : instructors
    Created on : Mar 20, 2015, 2:55:19 PM
    Author     : taher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LABORUN, Instructors</title>
        <script>
            function showSaveButton() {
                var x = document.getElementsByClassName("editButton1"); // OR
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = 'block';
                    x[i].disabled = false;

                }

                var y = document.getElementsByClassName("form-control");

                for (i = 0; i < y.length; i++) {
                    y[i].disabled = false;
                }
                // document.getElementById("editButton").style.visibility = "invisible";
                document.getElementById("editButton").disabled = true;

            }
        </script>
    </head>
    <body>
        <jsp:include page="adminHeader.jsp"/>

        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">

                <h3><i class="fa fa-angle-right"></i> Instructor Name: </h3>

                <!-- SIMPLE TO DO LIST -->
                <div class="row mt">
                    <div class="col-md-12">
                        <div id="groups_list">
                            <div class="panel-heading">
                                <input type="button" value="Edit Instructor" id="editButton" onclick="showSaveButton()"/>
                                <input type="submit" value="Save" class="editButton1" id="saveButton"  hidden="true"/>
                                <input type="reset" value="cancel" id="cancel" class="editButton1" hidden="true"/>
                            </div>
                            <div class="custom-check goleft mt">
                                <table id="todo" class="table table-hover custom-check">
                                    <tbody>
                                        <tr>
                                            <td>

                                                <label>Instructor ID: </label>
                                                <input type="text" value="ID123" class="form-control" id="iId" disabled=""/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>

                                                <label>Department : </label>
                                                <input type="text" value="embeded" class="form-control" id="deptName" disabled=""/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>

                                                <label>Phone : </label>
                                                <input type="text" value="0123456" class="form-control" id="phone" disabled=""/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>

                                                <label>E-mail : </label>
                                                <input type="text" value="test@yahoo.com" class="form-control" id="email" disabled=""/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>

                                                <label>Password : </label>
                                                <input type="text" value="password" class="form-control" id="pass" disabled=""/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>

                                                <label>Age : </label>
                                                <input type="text" value="28" class="form-control" id="age" disabled=""/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>

                                                <label>Address : </label>
                                                <input type="text" value="2 testST - cairo" class="form-control" id="address" disabled=""/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <input type="checkbox" value="deActivate" class="editButton1" id="deactivate" disabled=""/> de-Activate

                                            </td>
                                            <td>
                                            </td>
                                        </tr>  
                                        
                                        <tr><td><h2>Supervises : </h2>></td></tr>
                                        <tr>
                                            <td>
                                                <a href="group.jsp?name=grp1"/>grp1
                                            </td>
                                            <td>
                                                <a href="#" class="editButton1" hidden="">remove</a>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="group.jsp?name=grp2"/>grp2
                                            </td>
                                            <td>
                                                <a href="#" class="editButton1" hidden="">remove</a>
                                            </td>

                                        </tr>
                                        
                                        <tr><td><h2>involved in Courses : </h2>></td></tr>
                                        <tr>
                                            <td>
                                                <a href="course.jsp?name=UML"/>UML
                                            </td>
                                            <td>
                                                <a href="#" class="editButton1" hidden="">remove</a>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="course.jsp?name=Ajax"/>AJAX
                                            </td>
                                            <td><a href="#" class="editButton1" hidden="">remove</a></td>
                                        </tr>

                                        <tr><td><h2>involved in Labs : </h2>></td></tr>
                                        <tr>
                                            <td>
                                                <a href="lab.jsp?name=lab1-restful"/>lab1-restful
                                            </td>
                                            <td>
                                                <a href="#" class="editButton1" hidden="">remove</a>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="lab.jsp?name=lab2-saaj"/>MAD
                                            </td>
                                            <td><a href="#" class="editButton1" hidden="">remove</a></td>
                                        </tr>
                                        <jsp:include page="adminFooter.html"/>
                                        </body>
                                        </html>
