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
<jsp:include page= "header.jsp"/>

<!--main content start-->
<section id="main-content">
    <section class="wrapper site-min-height">
        <h3><i class="fa fa-angle-right"></i> Groups</h3>

        <div class="row mt">
            <div class="col-lg-12">
                <div class="row">
                <c:forEach items="${requestScope.groups}" var="group">
                    <div class="col-lg-4 col-md-4 col-sm-4 mb">
                        <div class="twitter-panel pn">
                            <i class="fa fa-twitter fa-4x"></i>
                            <p class="user"><a href="courses?gid=<c:out value='${group.id}'/>&gname=<c:out value='${group.groupName}'/>" >
                                <c:out value="${group.groupName}"/>
                            </a></p>
                        </div>
                    </div>
                </c:forEach>
                </div>
            </div>
        </div>



    </section><! --/wrapper -->
</section><!-- /MAIN CONTENT -->

<!--main content end-->

<jsp:include page= "footer.html"/>
</body>
</html>
