<%-- 
    Document   : departments
    Created on : Mar 21, 2015, 10:08:48 AM
    Author     : taher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/getDepartments"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LABORUN</title>
    </head>
    <body>
        <jsp:include page="adminHeader.html"/>
        <section id="main-content">
            <section class="wrapper">
                <h3><i class="fa fa-angle-right"></i> Departments: </h3>
                <div class="row mt">
                    <div class="col-lg-12">
                        <div class="panel-heading">

                            <h4 align="right"><a href="addDepartment.jsp"><i class="fa fa-angle-right"></i>Add Department</a></h4>

                        </div>
                        <div class="content-panel">
                            <table class="table table-bordered table-striped table-condensed">
                                <thead>
                                    <tr>
                                        <th>Department ID</th>
                                        <th>Department Name</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    
                                        
                                         <c:forEach var="vehicle" items="${departments}">
                <tr>
                   
                    <td>
                         <c:out value="${vehicle}" /> 
                       <!-- <a href="department.jsp?name=Ewd">EWD</a> -->
                    </td>
                    <td>DeptId1</td>
                </tr>
                </c:forEach> 
                                        
                                   
                                </tbody>
                            </table>
                            <jsp:include page="adminFooter.html"/>

                            </body>
                            </html>
