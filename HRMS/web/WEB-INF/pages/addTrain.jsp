<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/2/24
  Time: 14:09
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
<form action="addTrain" method="post">
    标题：<input type="text" name="tn_title"><br/>
    时间: <input type="text" name="tn_time"><br/>
    地点: <input type="text" name="tn_place"><br/>
    内容: <input type="text" name="tn_content"><br/>
    部门:
        <select name="d_id">
            <option value="0">请选择</option>
            <c:forEach items="${departs}" var="depart">
                <option value="${depart.d_id}">${depart.d_name}</option>
            </c:forEach>
        </select><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
