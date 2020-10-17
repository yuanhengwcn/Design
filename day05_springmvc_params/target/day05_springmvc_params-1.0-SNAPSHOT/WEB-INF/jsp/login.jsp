<%--
  Created by IntelliJ IDEA.
  User: 王元亨
  Date: 2020/10/14
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <form action="/check" method="post">
        用户名：<input type="text" name="username" value="${username}"/>
        <br/>
        密码：<input type="password" name="password"/>
        <br/>
        <input type="submit" value="登录"/>
        <a href="/reg">立即注册</a>
    </form>
</body>
</html>
