<%-- 
    Document   : intakes
    Created on : Mar 21, 2015, 10:25:02 AM
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
        <section id="main-content">
            <section class="wrapper">
                <h3><i class="fa fa-angle-right"></i> Intakes: </h3>
                <div class="row mt">
                    <div class="col-lg-12">
                        <div class="panel-heading">

                            <h4 align="right"><a href="addIntake.jsp"><i class="fa fa-angle-right"></i>Add Intake</a></h4>

                        </div>

                        <div class="content-panel">
                            <table class="table table-bordered table-striped table-condensed">
                                <thead>
                                    <tr>
                                        <th>Intake ID</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    
                                     <c:forEach items="${sessionScope.iList}" var="row">
                                  
                                                            
                                      <tr>
                                        <td>Intake <c:out value="${row.intakeNum}" /></td>
                                    </tr>                   
                                     </c:forEach>                             
                                </tbody>
                            </table>
                            <jsp:include page="adminFooter.html"/>

                            </body>
                            </html>
