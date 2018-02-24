<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/2/24
  Time: 13:28
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
<table border="1px" cellpadding="5px" cellspacing="2px">
    <tr>
        <th>标题</th>
        <th>时间</th>
        <th>地点</th>
        <th>内容</th>
        <th>部门</th>
    </tr>
    <c:forEach items="${trains}" var="train">
        <tr>
            <td>${train.tn_title}</td>
            <td>${train.tn_time}</td>
            <td>${train.tn_place}</td>
            <td>${train.tn_content}</td>
            <td>${train.department.d_name}</td>
        </tr>
    </c:forEach>
</table>
<a href="toAddTrain">添加培训信息</a><br/>
<a href="toManager">返回到管理页面</a>
</body>
</html>
