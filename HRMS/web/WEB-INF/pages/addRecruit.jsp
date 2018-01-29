<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/29
  Time: 16:24
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
    <title>添加招聘信息页面</title>
</head>
<body>
    <form action="addRecruit" method="post">
        职位：<input type="text" name="rc_position"/>
        要求：<input type="text" name="rc_required"/>
        待遇：<input type="text" name="rc_minsalary"/>-<input type="text" name="rc_maxsalary"/>
        人数：<input type="text" name="rc_number"/>
    </form>
</body>
</html>
