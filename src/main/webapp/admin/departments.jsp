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
        <jsp:include page="adminHeader.jsp"/>
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
                                <tr>
                                <th> department id </th>
                                 <th> department name </th>
                                    </tr>
                                <tbody>
                                             
                                                            
                                      <tr>
                                <c:forEach items="${sessionScope.dList}" var="row"> 
                                  
                                                            
                                      <tr>
                                        <td> <c:out value="${row.id}" /></td>
                                         <td> <c:out value="${row.departmentName}" /></td>
                                    </tr>                   
                                     </c:forEach>        
                                    </tr>                   
                                      
                                        
                                   
                                </tbody>
                            </table>
                            <jsp:include page="adminFooter.html"/>

                            </body>
                            </html>
