<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>

<html lang="en">
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

        <title></title>

        <!-- Bootstrap core CSS -->
        <link href="../assets/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="../assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="../assets/css/zabuto_calendar.css">
        <link rel="stylesheet" type="text/css" href="../assets/js/gritter/css/jquery.gritter.css" />
        <link rel="stylesheet" type="text/css" href="../assets/lineicons/style.css">    

        <!-- Custom styles for this template -->
        <link href="../assets/css/style.css" rel="stylesheet">
        <link href="../assets/css/style-responsive.css" rel="stylesheet">

        <script src="../assets/js/chart-master/Chart.js"></script>

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>

        <section id="container" >
            <!-- **********************************************************************************************************************************************************
            TOP BAR CONTENT & NOTIFICATIONS
            *********************************************************************************************************************************************************** -->
            <!--header start-->
            <header class="header black-bg">
                <div class="sidebar-toggle-box">
                    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                </div>
                <!--logo start-->
                <a href="index.jsp" class="logo"><b>Home</b></a>
                <!--logo end-->

                <div class="top-menu">
                    <ul class="nav pull-right top-menu">
                        <li><a class="logout" href="login.html">Logout</a></li>
                    </ul>
                </div>
            </header>
            <!--header end-->

            <!-- **********************************************************************************************************************************************************
            MAIN SIDEBAR MENU
            *********************************************************************************************************************************************************** -->
            <!--sidebar start-->
            <aside>
                <div id="sidebar"  class="nav-collapse ">
                    <!-- sidebar menu start-->
                    <ul class="sidebar-menu" id="nav-accordion">

                        <p class="centered"><a href="profile.html"><img src="../assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
                        <h5 class="centered"><c:out value='${user.getName()}'/></h5>

                        <li class="mt">
                            <a class="active" href="index.jsp">
                                <i class="fa fa-dashboard"></i>
                                <span name="radwa">Profile</span>
                            </a>
                        </li>

                        <li class="mt">
                            <a class="active" href="groups">
                                <i class="fa fa-dashboard"></i>
                                <span>Groups</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </aside>
            <!--sidebar end-->

            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">

                    <div class="row">
                        <div class="col-lg-9 main-chart">

                        </div>
                        <!-- /col-lg-9 END SECTION MIDDLE -->


                        <!-- **********************************************************************************************************************************************************
                        RIGHT SIDEBAR CONTENT
                        *********************************************************************************************************************************************************** -->                  

                        <div class="col-lg-3 ds">
                            <!--COMPLETED ACTIONS DONUTS CHART-->
                            <h3>NOTIFICATIONS</h3>

                            <!-- First Action -->
                            <div class="desc">
                                <div class="thumb">
                                    <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                                </div>
                                <div class="details">
                                    <p><muted>2 Minutes Ago</muted><br/>
                                    <a href="#">James Brown</a> subscribed to your newsletter.<br/>
                                    </p>
                                </div>
                            </div>
                            <!-- Second Action -->
                            <div class="desc">
                                <div class="thumb">
                                    <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                                </div>
                                <div class="details">
                                    <p><muted>3 Hours Ago</muted><br/>
                                    <a href="#">Diana Kennedy</a> purchased a year subscription.<br/>
                                    </p>
                                </div>
                            </div>
                            <!-- Third Action -->
                            <div class="desc">
                                <div class="thumb">
                                    <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                                </div>
                                <div class="details">
                                    <p><muted>7 Hours Ago</muted><br/>
                                    <a href="#">Brandon Page</a> purchased a year subscription.<br/>
                                    </p>
                                </div>
                            </div>
                            <!-- Fourth Action -->
                            <div class="desc">
                                <div class="thumb">
                                    <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                                </div>
                                <div class="details">
                                    <p><muted>11 Hours Ago</muted><br/>
                                    <a href="#">Mark Twain</a> commented your post.<br/>
                                    </p>
                                </div>
                            </div>
                            <!-- Fifth Action -->
                            <div class="desc">
                                <div class="thumb">
                                    <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                                </div>
                                <div class="details">
                                    <p><muted>18 Hours Ago</muted><br/>
                                    <a href="#">Daniel Pratt</a> purchased a wallet in your store.<br/>
                                    </p>
                                </div>
                            </div>



                            <!-- CALENDAR-->
                            <div id="calendar" class="mb">
                                <div class="panel green-panel no-margin">
                                    <div class="panel-body">
                                        <div id="date-popover" class="popover top" style="cursor: pointer; disadding: block; margin-left: 33%; margin-top: -50px; width: 175px;">
                                            <div class="arrow"></div>
                                            <h3 class="popover-title" style="disadding: none;"></h3>
                                            <div id="date-popover-content" class="popover-content"></div>
                                        </div>
                                        <div id="my-calendar"></div>
                                    </div>
                                </div>
                            </div><!-- / calendar -->

                        </div><!-- /col-lg-3 -->
                    </div><! --/row -->
                </section>
            </section>

            <!--main content end-->

        </section>

        <!-- js placed at the end of the document so the pages load faster -->
        <script src="../assets/js/jquery.js"></script>
        <script src="../assets/js/jquery-1.8.3.min.js"></script>
        <script src="../assets/js/bootstrap.min.js"></script>
        <script class="include" type="text/javascript" src="../assets/js/jquery.dcjqaccordion.2.7.js"></script>
        <script src="../assets/js/jquery.scrollTo.min.js"></script>
        <script src="../assets/js/jquery.nicescroll.js" type="text/javascript"></script>
        <script src="../assets/js/jquery.sparkline.js"></script>


        <!--common script for all pages-->
        <script src="../assets/js/common-scripts.js"></script>

        <script type="text/javascript" src="../assets/js/gritter/js/jquery.gritter.js"></script>
        <script type="text/javascript" src="../assets/js/gritter-conf.js"></script>

        <!--script for this page-->
        <script src="../assets/js/sparkline-chart.js"></script>    
        <script src="../assets/js/zabuto_calendar.js"></script>	



        <script type="application/javascript">
            $(document).ready(function () {
            $("#date-popover").popover({html: true, trigger: "manual"});
            $("#date-popover").hide();
            $("#date-popover").click(function (e) {
            $(this).hide();
            });

            $("#my-calendar").zabuto_calendar({
            action: function () {
            return myDateFunction(this.id, false);
            },
            action_nav: function () {
            return myNavFunction(this.id);
            },
            ajax: {
            url: "show_data.php?action=1",
            modal: true
            },
            legend: [
            {type: "text", label: "Special event", badge: "00"},
            {type: "block", label: "Regular event" }
            ]
            });
            });


            function myNavFunction(id) {
            $("#date-popover").hide();
            var nav = $("#" + id).data("navigation");
            var to = $("#" + id).data("to");
            console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
            }
        </script>


    </body>
</html>
