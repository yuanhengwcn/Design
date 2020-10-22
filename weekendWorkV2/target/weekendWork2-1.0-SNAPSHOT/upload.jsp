<%--
  Created by IntelliJ IDEA.
  User: 王元亨
  Date: 2020/10/19
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload/test1" method="post" enctype="multipart/form-data">
    file:<input type="file" name="source"/>
    <br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
