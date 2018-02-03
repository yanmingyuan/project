<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/29
  Time: 16:33
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
    <title>招聘信息展示页面</title>
</head>
<body>
    <table border="1px" cellpadding="5px" cellspacing="2px">
        <tr>
            <th>部门：</th>
            <th>职位：</th>
            <th>要求：</th>
            <th>待遇：</th>
            <th>人数：</th>
            <th>删除：</th>
        </tr>
        <c:forEach items="${recruits}" var="recruit">
            <tr>
                <td>${recruit.department.d_name}</td>
                <td>${recruit.position.p_name}</td>
                <td>${recruit.rc_required}</td>
                <td>${recruit.rc_minsalary}-${recruit.rc_maxsalary}</td>
                <td>${recruit.rc_number}</td>
                <td><a href="deleteRecruit?id=${recruit.rc_id}">删除此条记录</a></td>
            </tr>
        </c:forEach>
    </table>
    <a href="toManager">返回到管理界面</a>
</body>
</html>
