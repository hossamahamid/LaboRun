<%-- 
    Document   : trainees
    Created on : Mar 20, 2015, 11:59:20 PM
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
        <section id="main-content">
            <section class="wrapper">
                <h3><i class="fa fa-angle-right"></i> Trainees</h3>
                <div class="row mt">
                    <div class="col-lg-12">
                        <div class="panel-heading">

                     <!--       <h4 align="right"><a href="addTrainee.jsp"><i class="fa fa-angle-right"></i>Add Trainee</a></h4>-->
                     <form method="get" action="/LaboRun/NewTrainee1">
                         <input type="submit" value="add new Trainee"/>
                     </form>
                        </div>
                        <div class="content-panel">
                            <table class="table table-bordered table-striped table-condensed">
                                <thead>
                                    <tr>
                                        <th>Trainee Name</th>
                                        <th>Intake</th>
                                        <th>Department</th>
                                        <th>E-mail</th>
                                        <th>Address</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td><a href="trainee.jsp?name=ahmed">ahmed</a></td>
                                        <td>intake35</td>
                                        <td>dept1</td>
                                        <td>test@yahoo.com</td>
                                        <td>address 1</td>

                                    </tr>
                                    <tr>
                                        <td><a href="trainee.jsp?name=hassan">hassan</a></td>
                                        <td>intake35</td>
                                        <td>dept1</td>
                                        <td>test@yahoo.com</td>
                                        <td>address 2</td>

                                    </tr>                                  
                                </tbody>
                            </table>
                            <jsp:include page="adminFooter.html"/>
                            </body>
                            </html>
