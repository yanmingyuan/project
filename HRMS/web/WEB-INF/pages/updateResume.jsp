<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/30
  Time: 15:25
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
<form action="updateResume" method="post">
    姓名：<input type="text" name="r_realName" placeholder="${resume.r_realName}"/><br/>
    性别：<input type="radio" name="r_sex" value="男"/>男
    <input type="radio" name="r_sex" value="女"/>女<br/>
    生日：<input type="text" name="r_birth" placeholder="${resume.r_birth}"/><br>
    邮箱：<input type="text" name="r_email" placeholder="${resume.r_email}"/><br/>
    手机：<input type="text" name="r_phone" placeholder="${resume.r_phone}"/><br/>
    现居住地：<input type="text" name="r_livingPlace" placeholder="${resume.r_livingPlace}"/><br/>
    籍贯：<input type="text" name="r_address" placeholder="${resume.r_address}"/><br/>
    学校：<input type="text" name="r_school" placeholder="${resume.r_school}"/><br/>
    学历：<input type="text" name="r_education" placeholder="${resume.r_education}"/><br/>
    经历：<br/><textarea  name="r_experience" placeholder="${resume.r_experience}"></textarea><br/>
    婚配：<input type="radio" name="r_ismarriage" value="1"/>已婚<br/>
    <input type="radio" name="r_ismarriage" value="2"/>未婚<br/>
    证书：<input type="text" name="r_certificate" placeholder="${resume.r_certificate}"/><br/>
    民族：<input type="text" name="r_nation" placeholder="${resume.r_nation}"/><br/>
    自我评价：<br/><textarea  name="r_evaluation" placeholder="${resume.r_evaluation}"></textarea><br/>
    <input type="submit" value="保存"/>
</form>
</body>
</html>
