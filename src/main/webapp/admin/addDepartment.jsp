<%-- 
    Document   : addDepartment
    Created on : Mar 21, 2015, 5:00:54 PM
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

                <h3><i class="fa fa-angle-right"></i> Add new Department : </h3>

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

                                                    <label>Department Name: </label>
                                                    <input type="text" value="group 1" class="form-control" id="gName" />
                                                </td>
                                            </tr>
                                            

                                            <tr><td><h2>involved Users : </h2>></td></tr>

                                            <tr><td>
                                                    <input type="checkbox" name="users" value="user1">user 1<br>
                                                    <input type="checkbox" name="users" value="user2">user 2<br>
                                                    <input type="checkbox" name="users" value="user3">user 3<br>


                                                </td>

                                            </tr>

                                            <tr><td><h2>add courses : </h2>></td></tr>

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

