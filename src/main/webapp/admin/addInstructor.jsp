<%-- 
    Document   : addInstructor
    Created on : Mar 21, 2015, 5:06:38 PM
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

                <h3><i class="fa fa-angle-right"></i> Add new instructor : </h3>

                <!-- SIMPLE TO DO LIST -->
                <div class="row mt">
                    <div class="col-md-12">
                        <div id="groups_list">
                            <form method ="post" action="/LaboRun/NewStaff">

                                <div class="panel-heading">
                                    <input type="submit" value="Save" class="editButton1" id="saveButton" />
                                    <input type="reset" value="cancel" id="cancel" class="editButton1" />
                                </div>
                                <div class="custom-check goleft mt">
                                    <table id="todo" class="table table-hover custom-check">
                                        <tbody>
                                            <tr>
                                                <td width="200px">

                                                    <label>name :</label>
                                                    <input type="text" name="Name" value=""  placeholder="Instructor name" class="form-control" id="InstructorName" />

                                                    <br>

                                                </td>
                                            </tr> 

                                            <tr>
                                                <td width="200px">

                                                    <label>phone number :</label>
                                                    <input type="text" name="phoneNumber" value=""  placeholder="phone number" class="form-control" id="InstructorPhone" />

                                                    <br>

                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="200px">

                                                    <label>email</label>
                                                    <input type="text" name="email" value=""  placeholder="Email :" class="form-control" id="InstructorEmail" />

                                                    <br>

                                                </td>
                                            </tr> 

                                            <tr>
                                                <td width="200px">

                                                    <label>password</label>
                                                    <input type="password" name="password" value=""  placeholder="password" class="form-control" id="Instructorpassword" />

                                                    <br>

                                                </td>
                                            </tr> 

                                            <tr>
                                                <td width="200px">

                                                    <label>age</label>
                                                    <input type="text" name="age" value=""  placeholder="age" class="form-control" id="age" />

                                                    <br>

                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="200px">

                                                    <label>address</label>
                                                    <input type="text" name="address" value=""  placeholder="address" class="form-control" id="Instructoraddress" />

                                                    <br>

                                                </td>
</tr><tr>
                                                <td width="200px">

                                                    <label>department</label>
                                                <br>
                                                     ${empty sessionScope.dList2}
                                                    <select name="selectedDepartment">
                                                       
                                                        <c:forEach items="${sessionScope.dList2}" var="row2">
                                                      
                                                            <option value="${row2.id}"><c:out value="${row2.departmentName}" /> 
                                                                </option> 
                                                        </c:forEach>
                                                    </select>

                                                    <br>

                                                </td>
</tr>

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

