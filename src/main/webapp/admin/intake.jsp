<%-- 
    Document   : intake
    Created on : Mar 21, 2015, 10:25:13 AM
    Author     : taher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LABORUN</title>

        <script>
            function showSaveButton() {
                var x = document.getElementsByClassName("editButton1"); // OR
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = 'block';
                }


                var y = document.getElementsByClassName("form-control");

                for (i = 0; i < y.length; i++) {
                    y[i].disabled = false;
                }
                // document.getElementById("editButton").style.visibility = "invisible";
                document.getElementById("editButton").disabled = true;

            }
        </script>
    </head>
    <body>
        <jsp:include page="adminHeader.html"/>

        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">

                <h3><i class="fa fa-angle-right"></i> Intake Name: </h3>

                <!-- SIMPLE TO DO LIST -->
                <div class="row mt">
                    <div class="col-md-12">
                        <div id="groups_list">
                            <div class="panel-heading">
                                <input type="button" value="Edit Course" id="editButton" onclick="showSaveButton()"/>
                                <input type="submit" value="Save" class="editButton1" id="saveButton"  hidden="true"/>
                                <input type="reset" value="cancel" class="editButton1" id="cancel" hidden="true"/>
                            </div>
                            <div class="custom-check goleft mt">
                                <table id="todo" class="table table-hover custom-check">
                                    <tbody>
                                        
                                        <tr><td><h2>List of Trainees : </h2>></td></tr>
                                        <tr>
                                            <td>
                                                <a href="trainee.jsp?name=taher"/>taher
                                            </td>
                                            <td>
                                                <a href="#" class="editButton1" hidden="">remove</a>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="trainee.jsp?name=hossam"/>hossam
                                            </td>
                                            <td><a href="#" class="editButton1" hidden="">remove</a></td>
                                        </tr>



                                        <jsp:include page="adminFooter.html"/>    </body>
                                        </html>
