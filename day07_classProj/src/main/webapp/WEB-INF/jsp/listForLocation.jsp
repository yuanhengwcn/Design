<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Title</title>
    <link href="/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script src="/static/jquery/jquery-3.3.1.min.js"></script>
    <script src="/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<h1>员工列表</h1>
<table class="table table-hover table-bordered">
    <tr>
        <th>街道地址</th>
        <th>邮编</th>
        <th>城市</th>
        <th>省份</th>
        <th>国家id</th>
        <th>国家名</th>
    </tr>
    <c:forEach items="${list}" var="e">
        <tr>
            <td>${e.streetAddress}</td>
            <td>${e.postalCode}</td>
            <td>${e.city}</td>
            <td>${e.stateProvince}</td>
            <td>${e.countryId}</td>
            <td>${e.countryName}</td>
            <td>编辑 删除</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>