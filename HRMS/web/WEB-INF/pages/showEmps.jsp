<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/2/25
  Time: 13:13
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
</head>
<body>
<table border="1px" cellspacing="3px" cellpadding="3px">
    <tr>
        <th>姓名</th>
        <th>性别</th>
        <th>部门</th>
        <th>职位</th>
        <th>奖惩</th>
        <th>换职</th>
    </tr>
    <c:forEach items="${emps}" var="emp">
        <tr>
            <td>${emp.e_name}</td>
            <td>${emp.e_sex}</td>
            <td>${emp.department.d_name}</td>
            <td>${emp.position.p_name}</td>
            <td><a href="toRewardPage?e_id=${emp.e_id}">奖惩</a></td>
            <td><a href="toChangeWork?e_id=${emp.e_id}">换职</a></td>
        </tr>
    </c:forEach>
</table>
<a href="toManager">返回到管理界面</a>
</body>
</html>
