<%-- 
    Document   : addGroup
    Created on : Mar 21, 2015, 11:23:02 AM
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
        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">

                <h3><i class="fa fa-angle-right"></i> Add New Group : </h3>

                <!-- SIMPLE TO DO LIST -->
                <div class="row mt">
                    <div class="col-md-12">
                        <div id="groups_list">
                            <form method ="post" action="">

                                <div class="panel-heading">
                                    <input type="submit" value="Save" class="editButton1" id="saveButton" />
                                    <input type="reset" value="cancel" id="cancel" class="editButton1" />
                                </div>
                                <div class="custom-check goleft mt">
                                    <table id="todo" class="table table-hover custom-check">
                                        <tbody>
                                            <tr>
                                                <td>

                                                    <label>group Name: </label>
                                                    <input type="text" value="group 1" class="form-control" id="gName" />
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <label>Intake Name: </label>
                                                    <select>
                                                        <option value="null">choose Intake</option>

                                                        <option value="intake1">intake1</option>
                                                        <option value="intake2">intake2[</option>
                                                        <option value="intake3">intake3</option>
                                                        <option value="intake4">intake4</option>

                                                    </select>
                                                </td>
                                            </tr>

                                            <tr><td><h2>group Members: </h2>></td></tr>

                                            <tr><td>
                                                    <input type="checkbox" name="trainees" value="hossam">hossam<br>
                                                    <input type="checkbox" name="trainees" value="alia">alia<br>
                                                    <input type="checkbox" name="trainees" value="radwa">radwa<br>


                                                </td>

                                            </tr>

                                            <tr><td><h2>group Courses: </h2>></td></tr>

                                            <tr>
                                                <td>
                                                    <input type="checkbox" name="courses" value="course1">course1<br>
                                                    <input type="checkbox" name="courses" value="course2">course2<br>
                                                    <input type="checkbox" name="courses" value="course3">course3<br>
                                                </td>
                                            </tr>

                                        </tbody>
                                    </table>
                                </div><!-- /table-responsive -->
                            </form>
                        </div><!--/ White-panel -->
                    </div><! --/col-md-12 -->
                </div><! -- row -->




                <jsp:include page="adminFooter.html"/>
                </body>
                </html>
