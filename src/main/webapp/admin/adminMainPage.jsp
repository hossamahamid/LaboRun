<%-- 
    Document   : mainAdminPage
    Created on : Mar 20, 2015, 2:24:30 PM
    Author     : taher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <jsp:include page="adminHeader.html"/>


        <!-- **********************************************************************************************************************************************************
MAIN CONTENT
*********************************************************************************************************************************************************** -->
        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">
                <div class="row">
                    <div class="nav-collapse">
                        <div class="row mtbox">
                            <div id="active-grp" class="btn-group">
                                <button type="button" class="btn btn-primary btn-lg" data-toggle="dropdown">
                                    Active Groups:
                                    <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="group.jsp">EWD-Cairo</a></li>
                                    <li><a href="group.jsp">MAD-Cairo</a></li>
                                    <li><a href="group.jsp">SD</a></li>
                                    <li class="divider"></li>
                                    <li><a href="group.jsp">EWD-Mansoura</a></li>
                                </ul>
                            </div>

                            <div id="Courses" class="btn-group" >
                                <button type="button" class="btn btn-primary btn-lg" data-toggle="dropdown">
                                    Active Groups:
                                    <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="group.jsp">EWD-Cairo</a></li>
                                    <li><a href="group.jsp">MAD-Cairo</a></li>
                                    <li><a href="group.jsp">SD</a></li>
                                    <li class="divider"></li>
                                    <li><a href="group.jsp">EWD-Mansoura</a></li>
                                </ul>
                            </div>
                            <div id="labs" class="btn-group" >
                                <button type="button" class="btn btn-primary btn-lg" data-toggle="dropdown">
                                    Active Groups:
                                    <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="group.jsp">EWD-Cairo</a></li>
                                    <li><a href="group.jsp">MAD-Cairo</a></li>
                                    <li><a href="group.jsp">SD</a></li>
                                    <li class="divider"></li>
                                    <li><a href="group.jsp">EWD-Mansoura</a></li>
                                </ul>
                            </div>
                            <!--                            <li class="sub-menu dcjq-parent-li">
                            
                                                                                            <a href="" >
                                                                                                <i class="fa fa-tasks"></i>
                                                                                                <span onclick="function 90{document.getElementById('subCourses').css.style.visible(true)}">Courses</span>
                                                                                            </a>
                                                            <ul id="sub-Groups"class="sub" style=" ; overflow: hidden; display: block;">
                                                                <i class="fa fa-tasks"></i>
                                                                <span  style="font-size: x-large">Active Groups: </span>
                            
                                                                <li><a  href=""><h4>EWD</h4></a></li>
                                                                <li><a  href=""><h4>MAD</h4></a></li>
                                                                <li><a  href=""><h4>open-source</h4></a></li>
                                                            </ul>
                                                        </li>-->
                        </div><!-- /row mt -->	


                        <div class="row mt">
                            <!-- SERVER STATUS PANELS -->
                            <div class="col-md-4 col-sm-4 mb">

                            </div><!-- /col-md-4-->


                            <div class="col-md-4 col-sm-4 mb">

                            </div><!-- /col-md-4 -->

                            <div class="col-md-4 mb">
                                <!-- WHITE PANEL - TOP USER -->

                            </div><!-- /col-md-4 -->                    	

                        </div><!-- /row -->


                        <div class="row">
                        </div>
                        <div class="row mt">
                            <!--CUSTOM CHART START -->
                            <div class="border-head">
                                <h3>VISITS</h3>
                            </div>
                            <!--custom chart end-->
                        </div><!-- /row -->	

                    </div><!-- /col-lg-9 END SECTION MIDDLE -->


                    <!-- **********************************************************************************************************************************************************
                    RIGHT SIDEBAR CONTENT
                    *********************************************************************************************************************************************************** -->                  

                    <!--main content end-->


                    <jsp:include page="adminFooter.html"/>


                    </body>
                    </html>
