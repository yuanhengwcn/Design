<%--
  Created by IntelliJ IDEA.
  User: 王元亨
  Date: 2020/10/19
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>验证码</title>
    <script>
        $(function(){
            $("#cap").click(function(){
                //刷新验证码
                path = $(this).attr("src")+"?"+new Date().getTime();
                $(this).attr("src",path);
            });
        });
    </script>

</head>
<body>
<img src="${pageContext.request.contextPath}/captcha" style="width:85px" id="cap"/>



</body>
</html>
