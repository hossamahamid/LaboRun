<%--
  Created by IntelliJ IDEA.
  User: Rainfall
  Date: 3/22/2015
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Groups - Laborun</title>
</head>
<body>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<jsp:include page= "header.html"/>

<!--main content start-->
<section id="main-content">
    <section class="wrapper site-min-height">
        <h3><i class="fa fa-angle-right"></i> Groups</h3>

        <div class="row mt">
            <div class="col-lg-12">
                <%--<c:forEach begin="0" end="2">--%>
                <div class="row">
                <c:forEach items="${requestScope.groups}" var="group">
                    <div class="col-lg-4 col-md-4 col-sm-4 mb">
                        <div class="twitter-panel pn">
                            <i class="fa fa-twitter fa-4x"></i>
                            <p class="user"><a href="group.jsp?" + <c:out value="${group.id}"/> >
                                <c:out value="${group.groupName}"/>
                            </a></p>
                        </div>
                    </div>
                </c:forEach>
                </div>
                <%--</c:forEach>--%>

                <! -- 1st ROW OF PANELS -->
                <div class="row">
                    <!-- TWITTER PANEL -->
                    <div class="col-lg-4 col-md-4 col-sm-4 mb">
                        <div class="twitter-panel pn">
                            <i class="fa fa-twitter fa-4x"></i>
                            <p class="user"><a href="todo_list.html">Group 1</a></p>
                        </div>
                    </div><!-- /col-md-4 -->

                    <div class="col-lg-4 col-md-4 col-sm-4 mb">
                        <!-- WHITE PANEL - TOP USER -->
                        <div class="twitter-panel pn">
                            <i class="fa fa-twitter fa-4x"></i>
                            <p class="user"><a href="todo_list.html">Group 2</a></p>
                        </div>
                    </div><!-- /col-md-4 -->

                    <div class="col-lg-4 col-md-4 col-sm-4 mb">
                        <!-- INSTAGRAM PANEL -->
                        <div class="twitter-panel pn">
                            <i class="fa fa-twitter fa-4x"></i>

                            <p class="user"><a href="todo_list.html">Group 3</a></p>
                        </div>
                    </div><!-- /col-md-4 -->
                </div><! --/END 1ST ROW OF PANELS -->

                <! -- 2ND ROW OF PANELS -->
                <div class="row">
                    <! -- TODO PANEL -->
                    <div class="col-lg-4 col-md-4 col-sm-4 mb">
                        <div class="twitter-panel pn">
                            <i class="fa fa-twitter fa-4x"></i>

                            <p class="user"><a href="todo_list.html">Group 4</a></p>
                        </div>
                    </div><! --/col-md-4 -->

                    <! -- PROFILE 01 PANEL -->
                    <div class="col-lg-4 col-md-4 col-sm-4 mb">
                        <div class="twitter-panel pn">
                            <i class="fa fa-twitter fa-4x"></i>
                            <p class="user"><a href="todo_list.html">Group 5</a></p>
                        </div>
                    </div><! --/col-md-4 -->

                    <! -- PROFILE 02 PANEL -->
                    <div class="col-lg-4 col-md-4 col-sm-4 mb">
                        <div class="twitter-panel pn">
                            <i class="fa fa-twitter fa-4x"></i>

                            <p class="user"><a href="todo_list.html">Group 6</a></p>
                        </div>
                    </div><!--/ col-md-4 -->
                </div><! --/END 2ND ROW OF PANELS -->

            </div>
        </div>



    </section><! --/wrapper -->
</section><!-- /MAIN CONTENT -->

<!--main content end-->

<jsp:include page= "footer.html"/>
</body>
</html>
