<%--
  Created by IntelliJ IDEA.
  User: Rainfall
  Date: 3/22/2015
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Courses</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<jsp:include page= "header.jsp"/>

<!--main content start-->
<section id="main-content">
    <section class="wrapper site-min-height">
        <h3><i class="fa fa-angle-right"></i> <c:out value="${requestScope.group.groupName}"/> -<i class="fa fa-angle-right"></i> Courses</h3>

        <c:forEach items="${requestScope.courses}" var="course">
            <div class="row mt">
                <div class="col-md-12">
                    <div class="content-panel">
                        <table class="table table-striped table-advance table-hover">
                            <h3>&nbsp;<c:out value="${course.courseName}"/></h3>
                            <hr>
                            <thead>
                            <tr>
                                <th style="width: 50%"> Lab</th>
                                <th> Start Date</th>
                                <th> End Date</th>
                            </tr>
                            </thead>

                            <c:forEach items="${course.labs}" var="lab">
                                <tr>
                                    <td style="width: 50%"><a href="lab?lid=<c:out value='${lab.id}'/>&lname=<c:out value='${lab.labName}'/>">
                                        <c:out value="${lab.labName}"/></a></td>
                                    <td><c:out value="${lab.startTime}"/></td>
                                    <td><c:out value="${lab.endTime}"/></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
        </c:forEach>
    </section><! --/wrapper -->
</section><!-- /MAIN CONTENT -->

<!--main content end-->

<jsp:include page= "footer.html"/>
</body>
</html>
