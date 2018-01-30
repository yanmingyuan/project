<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/29
  Time: 16:33
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
    <title>招聘信息</title>
</head>
<body>
    <a href="toAddResume">添加简历</a><br/>
    <a href="deleteResume">删除简历</a><br/>
    <a href="queryResume">查看简历</a><br/>
    <a href="toUpdateResume">修改简历</a><br/>
    <c:if test="${resume.r_state==1}">
        <a href="sendResume">投递简历</a>
    </c:if>
    <c:if test="${resume.r_state==2}">
        <p>简历已投递</p>
    </c:if>
    <c:if test="${resume.r_state==3}">
        <p>简历已被阅读</p>
    </c:if>
    <c:if test="${resume.r_state==4}">
        <p>恭喜你已被邀请面试，请确认是否面试</p>
        <a href="">确认面试</a>
    </c:if>
    <table border="1px" cellpadding="5px" cellspacing="2px">
        <tr>
            <th>职位</th>
            <th>要求</th>
            <th>待遇</th>
            <th>人数</th>
        </tr>
        <c:forEach items="${recruits}" var="recruit">
            <tr>
                <td>${recruit.rc_position}</td>
                <td>${recruit.rc_required}</td>
                <td>${recruit.rc_minsalary}-${recruit.rc_maxsalary}</td>
                <td>${recruit.rc_number}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
