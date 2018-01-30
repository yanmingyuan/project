<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/29
  Time: 19:56
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
    <form action="addResume" method="post">
        姓名：<input type="text" name="r_realName"/><br/>
        性别：<input type="radio" name="r_sex" value="男"/>男
        <input type="radio" name="r_sex" value="女"/>女<br/>
        生日：<input type="text" name="r_birth"/><br>
        邮箱：<input type="text" name="r_email"/><br/>
        手机：<input type="text" name="r_phone"/><br/>
        现居住地：<input type="text" name="r_livingPlace"/><br/>
        籍贯：<input type="text" name="r_address"/><br/>
        学校：<input type="text" name="r_school"/><br/>
        学历：<input type="text" name="r_education"/><br/>
        经历：<br/><textarea  name="r_experience"></textarea><br/>
        婚配：<input type="radio" name="r_ismarriage" value="1"/>已婚<br/>
              <input type="radio" name="r_ismarriage" value="2"/>未婚<br/>
        证书：<input type="text" name="r_certificate"/><br/>
        民族：<input type="text" name="r_nation"/><br/>
        自我评价：<br/><textarea  name="r_evaluation"></textarea><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
