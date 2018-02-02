<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/2/1
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
    <title>Title</title>
</head>
<body>
<table border="1px" cellspacing="3px" cellpadding="5px">
    <tr>
        <th>职位名称</th>
        <th>创建时间</th>
        <th>删除该职位</th>
    </tr>
    <c:forEach items="${positions}" var="position">
        <tr>
            <td>${position.p_name}</td>
            <td>${position.p_createTime}</td>
            <td><a href="deletePosition?p_id=${position.p_id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<a href="toShowDeparts">返回</a>
</body>
</html>
