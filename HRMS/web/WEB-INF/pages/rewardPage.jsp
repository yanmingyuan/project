<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/2/25
  Time: 13:31
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
    <form action="addReward" method="post">
        事&nbsp;&nbsp;&nbsp;&nbsp;由：<input type="text" name="rw_cause"/><br/>
        奖惩金额：<input type="text" name="rw_money"/><br/>
        <input type="submit" value="确定"/>
    </form>
</body>
</html>
