<%-- 
    Document   : addIntake
    Created on : Mar 21, 2015, 5:10:06 PM
    Author     : taher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

                <h3><i class="fa fa-angle-right"></i> Add new Trainee : </h3>

                <!-- SIMPLE TO DO LIST -->
                <div class="row mt">
                    <div class="col-md-12">
                        <div id="groups_list">
                            <form method ="post" action="/LaboRun/NewTrainee1">

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
                                                    <input type="text" name="Name" value=""  placeholder="Trainee name" class="form-control" id="TraineeName" />

                                                    <br>

                                                </td>
                                            </tr> 

                                            <tr>
                                                <td width="200px">

                                                    <label>phone number :</label>
                                                    <input type="text" name="phoneNumber" value=""  placeholder="phone number" class="form-control" id="TraineePhone" />

                                                    <br>

                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="200px">

                                                    <label>email</label>
                                                    <input type="text" name="email" value=""  placeholder="Email :" class="form-control" id="TraineeEmail" />

                                                    <br>

                                                </td>
                                            </tr> 

                                            <tr>
                                                <td width="200px">

                                                    <label>password</label>
                                                    <input type="password" name="password" value=""  placeholder="password" class="form-control" id="Traineepassword" />

                                                    <br>

                                                </td>
                                            </tr> 

                                            <tr>
                                                <td width="200px">

                                                    <label>age</label>
                                                    <input type="text" name="age" value=""  placeholder="age" class="form-control" id="Traineeage" />

                                                    <br>

                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="200px">

                                                    <label>address</label>
                                                    <input type="text" name="address" value=""  placeholder="address" class="form-control" id="Traineeaddress" />

                                                    <br>

                                                </td>
</tr><tr>
                                                <td width="200px">

                                                    <label>department</label>
                                                <br>
                                                    <select name="selectedDepartment">
                                                        
                                                      <c:forEach items="${sessionScope.dList}" var="row">
                                                      
                                                            <option value="${row.id}">   <c:out value="${row.departmentName}" />
                                                                </option> 
                                                        </c:forEach>
                                                    </select>

                                                    <br>

                                                </td>
</tr>
                                                <tr><td width="200px">

                                                    <label>intake</label>
                                                  <br>
                                                    <select name="selectedIntake">
                                                         <c:forEach items="${sessionScope.iList}" var="row">
                                                      
                                                            <option value="${row.id}">   <c:out value="${row.intakeNum}" />  </option> 
                                                                 
                                                               
                                                        </c:forEach>
                                                    </select>

                                                    <br>

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

