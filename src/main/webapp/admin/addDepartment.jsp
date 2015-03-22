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
                            <form method ="post" action="/LaboRun/NewDepartment">

                                <div class="panel-heading">
                                    <input style="alignment-adjust: central ;" type="submit" value="Save" class="editButton1" id="saveButton" />
                                    <input type="reset" value="cancel" id="cancel" class="editButton1" />
                                </div>
                                <div class="custom-check goleft mt">
                                    <table id="todo" class="table table-hover custom-check">
                                        <tbody>
                                            <tr>
                                                <td width="200px">

                                                    <label>Department Name</label>
                                                    <input type="text" name="departmentName" value=""  placeholder="department name" class="form-control" id="departmentName" />
                                              
                                                    <br>
                                                     ${error}
                                                </td>
                                            </tr>   
                                        </tbody>
                                    </table>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>




                <jsp:include page="adminFooter.html"/>
                </body>

                </html>

