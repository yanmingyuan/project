<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/2/1
  Time: 15:07
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
<a href="toAddDepart">新增部门</a>
<table border="1px" cellspacing="3px" cellpadding="5px">
    <tr>
        <th>部门名称</th>
        <th>创建时间</th>
        <th>删除部门</th>
        <th>查看该部门职位</th>
        <th>添加职位</th>
    </tr>
    <c:forEach items="${departs}" var="depart">
        <tr>
            <td>${depart.d_name}</td>
            <td>${depart.d_createTime}</td>
            <td><a href="deleteDepart?d_id=${depart.d_id}">删除</a></td>
            <td><a href="showPositions?d_id=${depart.d_id}">查看</a></td>
            <td><a href="toAddPosition?d_id=${depart.d_id}">添加职位</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
