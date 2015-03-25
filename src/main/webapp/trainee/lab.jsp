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
        <a href="index.jsp" class="logo"><b>LABORUN</b></a>
        <!--logo end-->
        <div class="top-menu">
            <ul class="nav pull-right top-menu">
                <li><a class="logout" href="../login.html">Logout</a></li>
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
            <!-- sidebar menu end-->
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
                                        <a href="RequestAssistenceQueue?Assqueue=${sessionScope.assq.id}"><button class="btn btn-success btn-xs" <c:if test="${lab.labActive == 0}"> disabled </c:if>><i class=" fa fa-check"></i></button>   </a>
                                        <a href="RemoveFromAssistanceQueue?Assqueue=${sessionScope.assq.id}"> <button class="btn btn-danger btn-xs" <c:if test="${lab.labActive == 0}"> disabled </c:if>><i class="fa fa-trash-o "></i></button></a>
                                    </div>
                                    <br>
                                </div>

                                <div class="custom-check goleft mt">
                                    <table id="assistanceQueueTable" class="table table-hover custom-check">
                                        <tbody>
                                            <c:forEach items="${sessionScope.assq.traineeInQueues}" var="traineeInQueue">
                                                <tr>
                                                    <td>
                                                        <span><a href="?<c:out value='${traineeInQueue.trainee.id}'/>"><c:out value="${traineeInQueue.trainee.name}"/></a></span>
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
                                         <a href="RequestDelQueue?Delqueue=${sessionScope.delv.id}"><button class="btn btn-success btn-xs" <c:if test="${lab.labActive == 0}"> disabled </c:if>><i class=" fa fa-check"></i></button>   </a>
                                         <a href="RemoveFromDeliveryQueue?Delqueue=${sessionScope.delv.id}">   <button class="btn btn-danger btn-xs" <c:if test="${lab.labActive == 0}"> disabled </c:if>><i class="fa fa-trash-o "></i></button> </a>
                                    </div>
                                    <br>
                                </div>

                                <div class="custom-check goleft mt" id ="but" >
                                    <table id="deliveryQueueTable" class="table table-hover custom-check">
                                        <tbody>
                                        <c:forEach items="${sessionScope.delv.traineeInQueues}" var="traineeInQueue">
                                            <tr>
                                                <td>
                                                    <span><a href="?<c:out value='${traineeInQueue.trainee.id}'/>"><c:out value="${traineeInQueue.trainee.name}"/></a></span>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div><!-- /table-responsive -->
                            </section>

                        </div><! --/col-lg-6 -->


                        <div class="col-lg-3 col-md-6 col-sm-12">
                            <!-- DROPDOWN BUTTONS -->
                            <div class="showback">
                                <h4>Assignment Files</h4>

                                <hr>

                                <h4> Upload Assignment File</h4>
                                <form enctype="multipart/form-data" method="post" action="go" >
                                    <input class="btn btn-primary btn-block" type="file" name="datafile" ><br>
                                    <input class="btn btn-primary" type="submit" value="send" <c:if test="${lab.labActive == 0}"> disabled </c:if>>
                                </form>

                            </div><!-- /col-lg-6 -->
                        </div>

                        <!--Notifications-->
                        <div class="col-lg-3 ds">
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

                        </div><!-- /col-lg-3 -->
                        <!-- End of Notifications -->

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

        
         <script>
   var request3;
function startRequest()
{

if (window.XMLHttpRequest)
  {
  request3=new XMLHttpRequest();
  }
else if(window.ActiveXObject)
  {
 request3 =new ActiveXObject("Microsoft.XMLHTTP");
  }
  
request3.onreadystatechange=hadlReq3;

request3.open("GET","/LaboRun/ViewQueue?",true);
request3.send(null);
}
    function hadlReq3()
  {
  
  if (request3.readyState == 4)
    {
       
    var s = request3.responseXML;
       var currentMessage;
    
      var messages= s.getElementsByTagName("Ass");
        for(var i=0 ; i<messages.length ; i++){
                        currentMessage = messages[i];
                        
                        var out2 = currentMessage.childNodes[0].childNodes[0].nodeValue;
                                                
                    }
   
        }
    else {
          
       
    }
  }   
      </script>
    </body>
</html>
