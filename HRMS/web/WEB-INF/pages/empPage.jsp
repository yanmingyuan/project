<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/2/3
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(function () {
            $("#inp1").click(function () {
                $("#d1").show();
            })
            $("#inp2").click(function () {
                $("#d1").hide();
            })
            $("#inp3").click(function () {
                $("#d2").show();
            })
            $("#inp4").click(function () {
                $("#d2").hide();
            })
            $("#inp5").click(function () {
                $("#d3").hide();
            })
            $("#inp6").click(function () {
                $("#d4").hide();
            })
            $("#inp7").click(function () {
                $("#d4").show();
            })
        })
    </script>
</head>
<body>
<c:if test="${attend.at_arriveTime==null}">
    <a href="clockForArrive">上班</a><br/>
</c:if>
<c:if test="${attend.at_arriveTime!=null&&attend.at_leaveTime==null}">
    <a id=a2 href="clockForLeave">下班</a><br/>
</c:if>
<c:if test="${attend.at_arriveTime!=null&&attend.at_leaveTime!=null}">
    <p>下班啦，路途注意安全</p>
</c:if>
<input id=inp1 type="button" value="查看个人基本信息"/>
<div id="d1" style="display: none">
    <input id=inp2 type="button" value="隐藏个人基本信息"/>
    <p>${sessionScope.employee}</p>
</div><br/>
<input id=inp3 type="button" value="查看培训信息"/>
    <div id="d2" style="display: none">
        <table border="1px" cellpadding="3px" cellspacing="3px">
            <tr>
                <th>标题</th>
                <th>时间</th>
                <th>地点</th>
                <th>内容</th>
            </tr>
            <c:forEach items="${trains}" var="train">
                <tr>
                    <td>${train.tn_title}</td>
                    <td>${train.tn_time}</td>
                    <td>${train.tn_place}</td>
                    <td>${train.tn_content}</td>
                </tr>
            </c:forEach>
        </table>
        <input id=inp4 type="button" value="隐藏培训信息"/>
        <p>${train}</p>
    </div>
<br/>
<a href="queryByMonthAndEmp">查看当月考勤记录</a>
<div id="d3">
    <c:if test="${attends!=null&&attends.size()!=0}">
        <table border="1px" cellpadding="3px" cellspacing="3px">
            <tr>
                <th>考勤记录</th>
                <th>上班时间</th>
                <th>下班时间</th>
            </tr>
            <c:forEach items="${attends}" var="attend">
                <tr>
                    <td>${attend.at_id}</td>
                    <td>${attend.at_arriveTime}</td>
                    <td>${attend.at_leaveTime}</td>
                </tr>
            </c:forEach>
        </table>
        <input id=inp5 type="button" value="隐藏"/>
    </c:if>
</div><br/>
<input id=inp7 type="button" value="查看自己的工资列表"/>
<div id="d4" style="display: none">
    <c:if test="${salaries!=null&&salaries.size()!=0}">
        <table border="1px" cellpadding="3px" cellspacing="3px">
            <tr>
                <th>年月</th>
                <th>薪资</th>
            </tr>
            <c:forEach items="${salaries}" var="salary">
                <tr>
                    <td>${salary.s_time}</td>
                    <td>${salary.s_basic+salary.s_reward+salary.s_security}</td>
                </tr>
            </c:forEach>
        </table>
        <input id=inp6 type="button" value="隐藏"/>
    </c:if>
</div>
</body>
</html>
