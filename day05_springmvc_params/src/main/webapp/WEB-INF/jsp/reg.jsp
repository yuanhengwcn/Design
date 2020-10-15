<%--
  Created by IntelliJ IDEA.
  User: 王元亨
  Date: 2020/10/14
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="/save" method="post">

    用户名:
    <input type="text" name="username" value="${username}"/><div>${sameNameInfo}</div><br/>
    密码：
    <input type="password" name="password"/><br/>
    性别：
    <input type="radio" name="gender" value="男">男<input name="gender" type="radio" value="女">女<br/>
    爱好：
    <input name="hobby" type="checkbox" value="吃饭">吃饭
    <input name="hobby" type="checkbox" value="睡觉">睡觉
    <input name="hobby" type="checkbox" value="看电影">看电影<br/>
    地址：
    <select name="address">
    <option value="上海">上海</option>
    <option value="广州">广州</option>
    <option value="河南">河南</option>
    <option value="山东">山东</option>
    </select>
    <br/>

    <input type="submit" value="注册"/>
    <input type="reset" value="重置"/>
</form>
</body>
</html>
