<%--
  Created by IntelliJ IDEA.
  User: 飞鸟
  Date: 2020/10/29
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<img src="/static/images/1.jpg"/>
<form action="" method="post">
    用户名：<input type="text" name="username"/><br/>
    密码：<input type="password" name="password"/><br/>
    <input type="submit" value="登录">
</form>
<span style="color:red">${error}</span>
</body>
</html>
