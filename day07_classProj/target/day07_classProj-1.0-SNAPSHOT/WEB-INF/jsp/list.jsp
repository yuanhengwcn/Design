<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Title</title>
    <link href="/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script src="/static/jquery/jquery-3.3.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<h1>员工列表</h1>
<table class="table table-hover table-bordered">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>邮箱</th>
        <th>入职日期</th>
        <th>岗位</th>
        <th>薪水</th>
        <th>领导</th>
        <th>部门</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="e">
        <tr>
            <td>${e.employeeId}</td>
            <td>${e.firstName}.${e.lastName}</td>
            <td>${e.email}</td>
            <td><fmt:formatDate value="${e.hireDate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
            <td>${e.jobTitle}</td>
            <td>${e.salary}</td>
            <td>${e.managerName}</td>
            <td>${e.departmentName}</td>
            <td>编辑 删除</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
