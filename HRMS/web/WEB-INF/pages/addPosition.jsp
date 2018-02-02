<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/2/1
  Time: 16:45
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
    <form action="addPosition" method="post">
        职位名称：<input type="text" name="p_name"/>
        <input type="submit" value="保存"/>
    </form>
</body>
</html>
