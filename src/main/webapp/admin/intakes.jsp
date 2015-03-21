<%-- 
    Document   : intakes
    Created on : Mar 21, 2015, 10:25:02 AM
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
                <h3><i class="fa fa-angle-right"></i> Intakes: </h3>
                <div class="row mt">
                    <div class="col-lg-12">
                        <div class="content-panel">
                            <table class="table table-bordered table-striped table-condensed">
                                <thead>
                                    <tr>
                                        <th>Department ID</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td><a href="intake.jsp?name=in33">intake 33</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="intake.jsp?name=in35">intake 35</a></td>
                                    </tr>                                
                                </tbody>
                            </table>
                            <jsp:include page="adminFooter.html"/>

    </body>
</html>
