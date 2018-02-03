<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/26
  Time: 13:06
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
    <title>$Title$</title>
  </head>
  <body>
    <a href="toAdminPage">管理员通道</a><br/>
    <a href="toLoginEmp">员工通道</a><br/>
    <a href="toVisitorPage">游客通道</a>
  </body>
</html>
