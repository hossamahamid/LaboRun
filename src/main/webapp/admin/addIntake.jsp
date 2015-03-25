<%-- 
    Document   : addIntake
    Created on : Mar 21, 2015, 5:10:06 PM
    Author     : taher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LABORUN</title>
        <script>
            var request0;
            function check() {
                var iNum = document.getElementById("iNum").value;
                if (window.XMLHttpRequest) {
                    request0 = new XMLHttpRequest();
                }
                else if (window.ActiveXObject) {
                    request0 = new ActiveXObject("Microsoft.XMLHTTP");
                }
                request0.onreadystatechange = handleReq0;
                request0.open("POST", "NewIntake?date=" + new Date(), true);
                request0.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                request0.send("iNum=" + iNum);

            }
            function handleReq0() {
                if (request0.readyState === 4) {
                    var result = request0.responseText;
                    document.getElementById("t1").innerHTML =result;
                    alert(result);
                    
/*            if(result === "found")
                    document.getElementById("t1").innerHTML ="invalid";
                eles {
                    document.getElementById("t1").innerHTML ="inserted";
                }
*/
        }
            }
        </script>
    </head>
    <body>
        <jsp:include page="adminHeader.jsp"/>
        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">

                <h3><i class="fa fa-angle-right"></i> Add new Intake : </h3>

                <!-- SIMPLE TO DO LIST -->
                <div class="row mt">
                    <div class="col-md-12">
                        <div id="groups_list">
                            <form method ="post" action="NewIntake">

                                <div class="panel-heading">
                                    <input type="button" value="Save" class="editButton1" id="saveButton" onclick="check()"/>
                                    <input type="reset" value="cancel" id="cancel" class="editButton1" />
                                </div>
                                <div class="custom-check goleft mt">
                                    <table id="todo" class="table table-hover custom-check">
                                        <tbody>

                                            <tr>
                                                <td>

                                                    <label>Intake Number: </label>
                                                    <input type="text" class="form-control" id="iNum" />
                                                    <span id="t1">qwewerw</span>
                                                </td>
                                            </tr>

                                           


                                        </tbody>
                                    </table>
                                </div><!-- /table-responsive -->
                            </form>
                        </div><!--/ White-panel -->
                    </div><! --/col-md-12 -->
                </div><! -- row -->




                <jsp:include page="adminFooter.html"/>
                </body>

                </html>

