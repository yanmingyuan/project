<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/29
  Time: 19:05
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
    <title>游客登录</title>
</head>
<body>
<form action="visitorLogin" method="post">
    账号：<input type="text" name="u_name"/><br/>
    密码：<input type="password" name="u_pass"/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
