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
        <jsp:include page="adminHeader.jsp"/>
        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">

                <h3><i class="fa fa-angle-right"></i> Add New Lab : </h3>

                <!-- SIMPLE TO DO LIST -->
                <div class="row mt">
                    <div class="col-md-12">
                        <div id="groups_list">
                            <form method ="post" action="/LaboRun/NewLab">

                                <div class="panel-heading">
                                    <input type="submit" value="Save" class="editButton1" id="saveButton" />
                                    <input type="reset" value="cancel" id="cancel" class="editButton1" />
                                </div>
                                <div class="custom-check goleft mt">
                                    <table id="todo" class="table table-hover custom-check">
                                        <tbody>
                                            <tr>
                                                <td>

                                                    <label>Lab Name: </label>
                                                    <input type="text" value="" class="form-control" id="gName" name="LabName" />
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <label>Course name: </label>
                                                    <select name="coursen">
                                                      

                                                     <c:forEach items="${sessionScope.cList}" var="row">
                                                            <option value="${row.id}"><c:out value="${row.courseName}" /></option>
                                                            
                                                         
                                                    </c:forEach>
                                                    </select>
                                                </td>
                                            </tr>

                                            <tr><td><h2>Staff Members: </h2>></td></tr>

                                            <tr><td>

                                                 
                                        <c:forEach items="${sessionScope.sList}" var="row">
                                            <input type="checkbox" name="staffn" value="${row.id}">
                                            <c:out value="${row.name}" />
                                            <br>
                                        </c:forEach>
                                                  
                                        </td>

                                        </tr>
                                           <tr><td><h2>Start Date : </h2>></td></tr>
                                         <tr>
                                                <td>

                                                    <input type="date" id="startDate" name="startDate"/>
                                                </td>
                                            </tr>
                                                     <tr><td><h2>End Date : </h2>></td></tr>
                                            <tr>
                                                <td>

                                                  
                                                    <input type="date" id="endDate" name="endDate"/>
                                                </td>
                                            </tr>
                                            <tr><td><h2>assignment deadline</h2>></td></tr> 
                                            <tr>
                                                <td>

                                                    <label>assignment deadline </label>
                                                    <input type="date" id="endDate" name="assignmentdeadline"/>
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
