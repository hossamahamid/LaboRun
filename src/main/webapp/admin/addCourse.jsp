<%-- 
    Document   : addCourse
    Created on : Mar 21, 2015, 1:26:40 PM
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
        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">

                <h3><i class="fa fa-angle-right"></i> Add new Course : </h3>

                <!-- SIMPLE TO DO LIST -->
                <div class="row mt">
                    <div class="col-md-12">
                        <div id="groups_list">
                            <form method ="post" action="NewCourse">

                                <div class="panel-heading">
                                    <input type="submit" value="Save" class="editButton1" id="saveButton" />
                                    <input type="reset" value="cancel" id="cancel" class="editButton1" />
                                </div>
                                <div class="custom-check goleft mt">
                                    <table id="todo" class="table table-hover custom-check">
                                        <tbody>
                                            <tr>
                                                <td>

                                                    <label>Course Name: </label>
                                                    <input type="text" value="" class="form-control" id="gName" name="courseName" />
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <label>Start Date : </label>
                                                    <input type="date" id="startDate" name="startDate"/>
                                                </td>
                                            </tr>

                                            <tr>
                                                <td>

                                                    <label>End Date : </label>
                                                    <input type="date" id="endDate" name="endDate"/>
                                                </td>
                                            </tr><!--
                                            <tr><td><h2>involved Departments : </h2>></td></tr>

                                            <tr><td>
                                                    <input type="checkbox" name="depts" value="dept1">dept 1<br>
                                                    <input type="checkbox" name="depts" value="dept2">dept 2<br>
                                                    <input type="checkbox" name="depts" value="dept3">dept 3<br>


                                                </td>

                                            </tr>

                                            <tr><td><h2>course Labs: </h2>></td></tr>

                                            <tr>
                                                <td>
                                                    <input type="checkbox" name="labs" value="lab1">lab1<br>
                                                    <input type="checkbox" name="labs" value="lab2">lab2<br>
                                                    <input type="checkbox" name="labs" value="lab3">lab3<br>
                                                </td>
                                            </tr>

                                            <tr><td><h2>Course Staff: </h2>></td></tr>


                                            <tr>
                                                <td>
                                                    <input type="checkbox" name="staffs" value="staff1">staff1<br>
                                                    <input type="checkbox" name="staffs" value="staff2">staff2<br>
                                                    <input type="checkbox" name="staffs" value="staff3">staff3<br>
                                                </td>
                                            </tr>
                                            
                                              <tr><td><h2>groups : </h2>></td></tr>


                                            <tr>
                                                <td>
                                                    <input type="checkbox" name="groups" value="grp1">grp1<br>
                                                    <input type="checkbox" name="groups" value="grp2">grp2<br>
                                                    <input type="checkbox" name="groups" value="grp3">grp3<br>
                                                </td>
                                            </tr> -->
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
