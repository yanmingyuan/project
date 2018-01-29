<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/29
  Time: 14:38
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
    <title>注册页面</title>
</head>
<body>
    <form action="register" method="post">
        账号：<input type="text" name="a_name" placeholder="请在此处输入账号"/><br>
        密码：<input type="text" name="a_pass" placeholder="请在此处输入密码"/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
