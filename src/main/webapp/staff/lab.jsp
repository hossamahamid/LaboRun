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

        <title>LABORUN</title>

        <!-- Bootstrap core CSS -->
        <link href="../assets/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="../assets/font-awesome/css/font-awesome.css" rel="stylesheet" />

        <!-- Custom styles for this template -->
        <link href="../assets/css/style.css" rel="stylesheet">
        <link href="../assets/css/style-responsive.css" rel="stylesheet">

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
                <a href="index.html" class="logo"><b>LABORUN</b></a>
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

                        <p class="centered"><a href="index.jsp"><img src="../assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
                        <h5 class="centered"><c:out value='${userName}'/></h5>

                        <li class="mt">
                            <a class="active" href="groups">
                                <i class="fa fa-dashboard"></i>
                                <span>Home</span>
                            </a>
                        </li>
                        <li class="mt">
                            <a href="groups">
                                <i class="fa fa-dashboard"></i>
                                <span>Profile</span>
                            </a>
                        </li>
                        <li class="mt">
                            <a href="groups">
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
                    <h3><i class="fa fa-angle-right"></i> <c:out value="${requestScope.lab.course.courseName}"/> -<i class="fa fa-angle-right"></i> <c:out value="${requestScope.lab.labName}"/></h3>
                    <div class="row mt">
                        <div class="col-lg-6 col-md-6 col-sm-12">

                            <h3 style="color: red"><c:out value="${requestScope.message}"/></h3>
                            <section class="task-panel tasks-widget">
                                <div class="panel-heading">
                                    <div class="pull-left"><h5><i class="fa fa-tasks"></i> Assistance queue</h5></div>
                                    <div class="pull-right hidden-phone">
                                        <button class="btn btn-danger btn-xs">show</button>
                                        <button class="btn btn-success btn-xs"><i class=" fa fa-check"></i></button>                                                 
                                        <button class="btn btn-danger btn-xs"><i class="fa fa-trash-o "></i></button>
                                    </div>
                                    <br>
                                </div>

                                <div class="custom-check goleft mt">
                                    <table id="assistanceQueueTable" class="table table-hover custom-check">
                                        <tbody>
                                            <c:forEach items="${requestScope.assistanceQueue.traineeInQueues}" var="traineeInQueue">
                                                <tr>
                                                    <td>
                                                        <a href="/LaboRun/NotificationsServ?traineeId=<c:out value='${traineeInQueue.trainee.id}'/>&note_type=assist"><c:out value="${traineeInQueue.trainee.name}"/></a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div><!-- /table-responsive -->
                            </section>
                            <section class="task-panel tasks-widget">
                                <div class="panel-heading">
                                    <div class="pull-left"><h5><i class="fa fa-tasks"></i> Delivery queue</h5></div>
                                    <div class="pull-right hidden-phone">
                                        <button class="btn btn-danger btn-xs" onclick="func()">show</button>
                                        <button class="btn btn-success btn-xs"><i class=" fa fa-check"></i></button>                                                 
                                        <button class="btn btn-danger btn-xs"><i class="fa fa-trash-o "></i></button>
                                    </div>
                                    <br>
                                </div>

                                <div class="custom-check goleft mt" id ="but" >
                                    <table id="deliveryQueueTable" class="table table-hover custom-check">
                                        <tbody>
                                        <c:forEach items="${requestScope.deliveryQueue.traineeInQueues}" var="traineeInQueue">
                                            <tr>
                                                <td>
                                                    <a href="?<c:out value='${traineeInQueue.trainee.id}'/>"><c:out value="${traineeInQueue.trainee.name}"/></a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div><!-- /table-responsive -->
                            </section>

                        </div><! --/col-lg-6 -->


                        <div class="col-lg-6 col-md-6 col-sm-12">
                            <!-- DROPDOWN BUTTONS -->
                            <div class="showback">
                                <h4>Lab Settings</h4>
                                <hr>
                                <form action="deadline" method="post">
                                    <input type="hidden" name="lid" value="<c:out value='${requestScope.lab.id}'/>">
                                    <input type="hidden" name="lname" value="<c:out value='${requestScope.lab.labName}'/>">
                                    <input type="date" name="dateLine">
                                    <input type="time" name="timeLine">
                                    <button type="submit" class="btn btn-primary btn-lg">Set Deadline</button>
                                </form>

                                <hr>
                                <button type="button" class="btn btn-primary btn-lg">View Assignment Files</button>

                                <hr>
                                <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModalShift" <c:if test="${lab.labActive == 0}"> disabled </c:if>>
                                    Shift Lab Queues
                                </button>

                                <!-- Modal -->
                                <div class="modal fade" id="myModalShift" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                <h4 class="modal-title" id="myModalLabel2">Shift Queues</h4>
                                            </div>
                                            <div class="modal-body">
                                                Are you sure you want to shift this lab queues?
                                                Queues will be closed
                                            </div>
                                            <div class="modal-footer">
                                                <%--<form action="closeQueue?lid=<c:out value='${requestScope.lab.id}'/>&lname=<c:out value='${requestScope.lab.labName}'/>" method="get">--%>
                                                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                                                <a href="shiftQueue?lid=<c:out value='${requestScope.lab.id}'/>&lname=<c:out value='${requestScope.lab.labName}'/>"><button type="button" class="btn btn-primary">Yes</button></a>
                                                <%--</form>--%>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <hr>

                                <!-- Button trigger modal -->
                                <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModalClose" <c:if test="${lab.labActive == 0}"> disabled </c:if>>
                                    Close Lab Queues
                                </button>

                                <!-- Modal -->
                                <div class="modal fade" id="myModalClose" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                <h4 class="modal-title" id="myModalLabel">Close Queues</h4>
                                            </div>
                                            <div class="modal-body">
                                                Are you sure you want to close this lab queues?
                                            </div>
                                            <div class="modal-footer">
                                                <%--<form action="closeQueue?lid=<c:out value='${requestScope.lab.id}'/>&lname=<c:out value='${requestScope.lab.labName}'/>" method="get">--%>
                                                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                                                <a href="closeQueue?lid=<c:out value='${requestScope.lab.id}'/>&lname=<c:out value='${requestScope.lab.labName}'/>"><button type="button" class="btn btn-primary">Yes</button></a>
                                                <%--</form>--%>
                                            </div>
                                        </div>
                                    </div>
                                </div>



                            </div><!-- /col-lg-6 -->
                        </div>

                    </div><!--/ row -->
                </section><! --/wrapper -->
            </section><!-- /MAIN CONTENT -->

            <!--main content end-->

        </section>
        <script>
            function func() {
                document.getElementById("but").style.visibility = 'visible';
            }
        </script>
        <!-- js placed at the end of the document so the pages load faster -->
        <script src="../assets/js/jquery.js"></script>
        <script src="../assets/js/jquery-1.8.3.min.js"></script>
        <script src="../assets/js/bootstrap.min.js"></script>
        <script class="include" type="text/javascript" src="../assets/js/jquery.dcjqaccordion.2.7.js"></script>
        <script src="../assets/js/jquery.scrollTo.min.js"></script>
        <script src="../assets/js/jquery.nicescroll.js" type="text/javascript"></script>


        <!--common script for all pages-->
        <script src="../assets/js/common-scripts.js"></script>

        <!--script for this page-->

        <script>
            //custom select box

            $(function () {
                $('select.styled').customSelect();
            });

        </script>

    </body>
</html>
