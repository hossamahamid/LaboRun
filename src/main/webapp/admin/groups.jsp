<%-- 
    Document   : groups
    Created on : Mar 20, 2015, 11:05:37 PM
    Author     : taher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="adminHeader.jsp"/>
        <section id="main-content">
            <section class="wrapper">
                <h3><i class="fa fa-angle-right"></i> Groups</h3>
                <div class="row mt">
                    <div class="col-lg-12">
                        <div class="panel-heading">
                                
                                <h4 align="right"><a href="NewGroup"><i class="fa fa-angle-right"></i>Add Group</a></h4>
                                
                            </div>
                        <div class="content-panel">
                            <table class="table table-bordered table-striped table-condensed">
                                <thead>
                                    <tr>
                                        <th>Group Name</th>
                                        <th>Group start Date</th>
                                        <th>Group End Date</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td><a href="group.jsp?name=grp1">group1</a></td>
                                        <td>22/04/2015</td>
                                        <td>30/06/2015</td>
                                    </tr>
                                    <tr>
                                        <td><a href="group.jsp?name=grp2">group2</a></td>
                                        <td>22/04/2015</td>
                                        <td>31/06/2015</td>
                                    </tr>                                   
                                </tbody>
                            </table>
                            <jsp:include page="adminFooter.html"/>

                            </body>
                            </html>
