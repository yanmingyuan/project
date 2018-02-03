<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/2/3
  Time: 16:07
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
    <form action="loginEmp" method="post">
        账号：<input type="text" name="e_name"/><br/>
        密码：<input type="password" name="e_pass"/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
