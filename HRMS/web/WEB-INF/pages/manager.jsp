<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/29
  Time: 16:17
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
    <a href="toAddRecruit">添加招聘信息</a><br/>
    <a href="queryAllRecruits">查看所有招聘信息</a><br/>
    <a href="scanResumes">浏览所有应聘信息</a><br/>

</body>
</html>
