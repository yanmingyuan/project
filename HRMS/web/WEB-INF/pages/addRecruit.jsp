<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(function () {
            $("#depart").change(function () {
                var d_id=$(this).val()
                $.ajax({
                    url:"queryPositions",
                    data:{"d_id":d_id},
                    javaType:"json",
                    success:function (positions) {
                        $("#position").empty()
                        var p=eval(positions)
                        var str="";
                        $.each(positions,function (index,value) {
                            str+="<option value="+value.p_id+">"+value.p_name+"</option>"
                        })
                        $("#position").append(str)
                    }
                })
                }
            )
        })
    </script>
</head>
<body>
    <form action="addRecruit" method="post">
        部门：<select id="depart" name="d_id">
                <option value="0">请选择</option>
                <c:forEach items="${departs}" var="depart">
                    <option value="${depart.d_id}" >${depart.d_name}</option>
                </c:forEach>
                </select><br/>
        职位：
              <select id="position" name="p_id">
                    <option value="0">请选择</option>
              </select><br/>
        要求：<textarea name="rc_required" rows="10" cols="30">输入要求</textarea><br/>
        待遇：<input type="text" name="rc_minsalary"/>-<input type="text" name="rc_maxsalary"/><br/>
        人数：<input type="text" name="rc_number"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
