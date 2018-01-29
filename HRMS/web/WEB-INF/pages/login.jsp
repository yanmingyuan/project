<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/29
  Time: 14:55
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
    <title>登录界面</title>
</head>
<body>
    <form action="login" method="post">
        账号：<input type="text" name="a_name"/><br/>
        密码：<input type="text" name="a_pass"/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
