<%-- 
    Document   : courses
    Created on : Mar 20, 2015, 2:54:54 PM
    Author     : taher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LABORUN, Courses</title>

        <script>
            function showSaveButton() {
                var x = document.getElementsByClassName("editButton1"); // OR
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = 'block';
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

                <h3><i class="fa fa-angle-right"></i> Course Name: </h3>

                <!-- SIMPLE TO DO LIST -->
                <div class="row mt">
                    <div class="col-md-12">
                        <div id="groups_list">
                            <div class="panel-heading">
                                <input type="button" value="Edit Course" id="editButton" onclick="showSaveButton()"/>
                                <input type="submit" value="Save" class="editButton1" id="saveButton"  hidden="true"/>
                                <input type="reset" value="cancel" id="cancel" class="editButton1" hidden="true"/>
                            </div>
                            <div class="custom-check goleft mt">
                                <table id="todo" class="table table-hover custom-check">
                                    <tbody>
                                        <tr>
                                            <td>

                                                <label>Course Name: </label>
                                                <input type="text" value="group 1" class="form-control" id="gName" disabled=""/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>

                                                <label>Course Start date: </label>
                                                <input type="date"  class="form-control" id="sDate" disabled=""/>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td>

                                                <label>Course Start date: </label>
                                                <input type="date"  class="form-control" id="eDate" disabled=""/>
                                            </td>
                                        </tr>


                                        
                                        <tr><td><h2>Instructor staff : </h2>></td></tr>
                                        <tr>
                                            <td>
                                                <a href="staff.jsp?name=mostafa"/>mostafa
                                            </td>
                                            <td>
                                                <a href="#" class="editButton1" hidden="">remove</a>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="staff.jsp?name=medhat"/>medhat
                                            </td>
                                            <td><a href="#" class="editButton1" hidden="">remove</a></td>
                                        </tr>


                                        <tr><td><h2>involved Departments : </h2>></td></tr>
                                        <tr>
                                            <td>
                                                <a href="group.jsp?name=EWD"/>EWD-Asyout
                                            </td>
                                            <td>
                                                <a href="#" class="editButton1" hidden="">remove</a>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="group.jsp?name=MAD"/>MAD
                                            </td>
                                            <td><a href="#" class="editButton1" hidden="">remove</a></td>
                                        </tr>

                                        
                                        <tr><td><h2>involved Groups : </h2>></td></tr>
                                        <tr>
                                            <td>
                                                <a href="group.jsp?name=EWD"/>EWD-Asyout
                                            </td>
                                            <td>
                                                <a href="#" class="editButton1" hidden="">remove</a>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="group.jsp?name=MAD"/>MAD
                                            </td>
                                            <td><a href="#" class="editButton1" hidden="">remove</a></td>
                                        </tr>

                                        <tr><td><h2>Labs : </h2>></td></tr>
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

                                        <jsp:include page="adminFooter.html"/>    </body>
                                        </html>
