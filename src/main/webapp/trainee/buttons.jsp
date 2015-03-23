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

        <title>DASHGUM - Bootstrap Admin Template</title>

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
                <a href="index.html" class="logo"><b>Home</b></a>
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
                            <a class="active" href="index.html">
                                <i class="fa fa-dashboard"></i>
                                <span>Profile</span>
                            </a>
                        </li>

                        <li class="mt">
                            <a class="active" href="panels.html">
                                <i class="fa fa-dashboard"></i>
                                <span>Groups</span>
                            </a>
                        </li>

                </div>
            </aside>
            <!--sidebar end-->

            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    <div class="row mt">
                        <div class="col-lg-6 col-md-6 col-sm-12">


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
                                    <table id="todo" class="table table-hover custom-check">
                                        <tbody>
                                            <tr>
                                                <td>

                                                    <a href="index.html#">hossam</a></span>

                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <a href="index.html#">taher</a></span>

                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <a href="index.html#">dina</a></span>

                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <a href="index.html#">aliaa</a></span>

                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <a href="index.html#">radwa</a></span>

                                                </td>
                                            </tr>
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
                                    <table id="todo" class="table table-hover custom-check">
                                        <tbody>
                                            <tr>
                                                <td>

                                                    <a href="index.html#">hossam</a></span>

                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <a href="index.html#">taher</a></span>

                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <a href="index.html#">dina</a></span>

                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <a href="index.html#">aliaa</a></span>

                                                </td>
                                            </tr>
                                            <tr>
                                                <td>

                                                    <a href="index.html#">radwa</a></span>

                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div><!-- /table-responsive -->
                            </section>

                        </div><! --/col-lg-6 -->


                        <div class="col-lg-6 col-md-6 col-sm-12">
                            <!-- DROPDOWN BUTTONS -->
                            <div class="showback">
                                <h4><i class="fa fa-angle-right"></i> Files</h4>
                                <!-- Single button -->
                                <h4><i class="fa fa-angle-right"></i>Upload</h4>
                                <form enctype="multipart/form-data" method="post" action="go" class="btn btn-primary btn-lg" >
                                    <input type="file" name="datafile" ><br>
                                    <input type="submit" value="send">
                                </form><br><br>
                                <div class="btn-group">
                                    <button type="button" class="btn btn-primary btn-lg" data-toggle="dropdown" onclick="GetAssignmentFiles">
                                        view uploaded file <span class="caret"></span>
                                    </button>
                                     <ul class="dropdown-menu" role="menu">
                                     <c:forEach items="${request.listOfFiles}" var="item">         
                                        <li><c:out value='${item}'/></li>
                                     </c:forEach>
                                  </ul>
                                </div>

                            </div><!-- /showback -->

                            <div class="showback">
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

                            </div>


                        </div><!-- /col-lg-6 -->

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
        <script src="../assets/js/jjquery-1.8.3.min.js"></script>
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
