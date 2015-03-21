<%-- 
    Document   : groups
    Created on : Mar 20, 2015, 2:52:49 PM
    Author     : taher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LABORUN,Groups</title>
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
        <jsp:include page="adminHeader.html"/>
        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">

                <h3><i class="fa fa-angle-right"></i> Group Name: </h3>

                <!-- SIMPLE TO DO LIST -->
                <div class="row mt">
                    <div class="col-md-12">
                        <div id="groups_list">
                            <div class="panel-heading">
                                <input type="button" value="Edit Group" id="editButton" onclick="showSaveButton()"/>
                                <input type="submit" value="Save" class="editButton1" id="saveButton"  hidden="true"/>
                                <input type="reset" value="cancel" id="cancel" class="editButton1" hidden="true"/>
                            </div>
                            <div class="custom-check goleft mt">
                                <table id="todo" class="table table-hover custom-check">
                                    <tbody>
                                        <tr>
                                            <td>

                                                <label>group Name: </label>
                                                <input type="text" value="group 1" class="form-control" id="gName" disabled=""/>
                                            </td>
                                        </tr>
                                        <tr><td><h2>group Members: </h2>></td></tr>
                                        <tr>
                                            <td>
                                                <a href="trainee.jsp?name=hossam"/> hossam 
                                            </td>
                                            <td>
                                                <a href="#" class="editButton1" hidden="">remove</a>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="trainee.jsp?name=radwa"/>radwa
                                            </td>
                                            <td><a href="#" class="editButton1" hidden="">remove</a></td>
                                        </tr>



                                        <tr><td><h2>group Courses: </h2>></td></tr>
                                        <tr>
                                            <td>
                                                <a href="course.jsp?name=javaWebSeervices"/>JAVA Web Services
                                            </td>
                                            <td>
                                                <a href="#" class="editButton1" hidden="">remove</a>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="course.jsp?name=advancedJsp"/>  Advanced JSP & SERVLET
                                            </td>
                                            <td><a href="#" class="editButton1" hidden="">remove</a></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div><!-- /table-responsive -->
                        </div><!--/ White-panel -->
                    </div><! --/col-md-12 -->
                </div><! -- row -->




                <jsp:include page="adminFooter.html"/>
                </body>
                </html>
