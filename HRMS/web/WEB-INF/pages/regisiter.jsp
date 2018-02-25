<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/29
  Time: 14:38
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
    <title>注册页面</title>
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(function () {
            $("#aname").blur(function () {
                var a_name=$(this).val();
                if(a_name==null||a_name==""){
                    $("#s1").html("不能为空");
                    $("#s1").css("color","red");
                }else{
                    $.ajax({
                        type:"post",
                        url:"checkAname",
                        data:"a_name="+$(this).val(),
                        success:function (data) {
                            $("#s1").html(data);
                        }
                    })
                }
            })
            $("#apass").blur(function () {
                var val=$(this).val();
                if(val.length<6){
                    $("#s2").css("background","red");
                    $("#s3").css("background","white");
                    $("#s4").css("background","white");
                }else if(val.length>=6&&val.length<=10){
                    $("#s2").css("background","red");
                    $("#s3").css("background","yellow");
                    $("#s4").css("background","white");
                }else if(val.length>10){
                    $("#s2").css("background","red");
                    $("#s3").css("background","yellow");
                    $("#s4").css("background","green");
                }
            })
        })
    </script>
</head>
<body>
    <form action="register" method="post">
        账号：<input type="text" name="a_name" id="aname" placeholder="请在此处输入账号"/>
        <span id="s1"></span><br>
        密码：<input type="password" name="a_pass" id="apass" placeholder="请在此处输入密码"/>
        <span id="s2">&nbsp;&nbsp;</span>
        <span id="s3">&nbsp;&nbsp;</span> <span id="s4">&nbsp;&nbsp;</span><br/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
