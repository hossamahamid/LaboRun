<%-- 
    Document   : addGroup
    Created on : Mar 21, 2015, 11:23:02 AM
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

                <h3><i class="fa fa-angle-right"></i> Add New Group : </h3>

                <!-- SIMPLE TO DO LIST -->
                <div class="row mt">
                    <div class="col-md-12">
                        <div id="groups_list">
                            <form method ="post" action="/LaboRun/NewGroup">

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
                                                    <input type="text" value="" class="form-control" id="gName" name="GroupName" />
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <label>Intake number: </label>
                                                    <select name="intaken">
                                                      

                                                     <c:forEach items="${sessionScope.iList}" var="row">
                                                            <option value="${row.id}"><c:out value="${row.intakeNum}" /></option>
                                                            
                                                         
                                                    </c:forEach>
                                                    </select>
                                                </td>
                                            </tr>

                                            <tr><td><h2>group Members: </h2>></td></tr>

                                            <tr><td>

                                                 
                                        <c:forEach items="${sessionScope.tList}" var="row">
                                            <input type="checkbox" name="traineen" value="${row.id}">
                                            <c:out value="${row.name}" />
                                            <br>
                                        </c:forEach>
                                                  
                                        </td>

                                        </tr>

                                        <tr><td><h2>group Courses: </h2>></td></tr>

                                        <tr>
                                            <td>
                                                
                                              <c:forEach items="${sessionScope.cList}" var="row">
                                            <input name="coursen" type="checkbox" value="${row.id}">
                                            <c:out value="${row.courseName}" />
                                            <br>
                                             </c:forEach>
                                                
                                            </td>
                                        </tr>

                                        
                                        <tr><td><h2>group staff members: </h2>></td></tr>

                                        <tr>
                                            <td>
                                              
                                                <c:forEach items="${sessionScope.sList}" var="row">
                                            <input type="checkbox" name="staffn" value="${row.id}">
                                            <c:out value="${row.name}" />
                                            <br>
                                        </c:forEach>
                                               
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
