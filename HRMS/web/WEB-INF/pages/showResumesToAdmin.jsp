<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/29
  Time: 19:39
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
    <title>简历展示页面</title>
</head>
<body>
    <table border="1px" cellpadding="5px" cellspacing="2px">
        <tr>
            <th>基本信息</th>
            <th>状态</th>
        </tr>
        <c:forEach items="${resumes}" var="resume">
            <tr>
                <td>${resume}</td>
                <td>
                    <c:if test="${resume.r_state==2}">
                        <a href="lookupResume?r_id=${resume.r_id}">查看</a>
                    </c:if>
                    <c:if test="${resume.r_state==4}">已邀请</c:if>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
