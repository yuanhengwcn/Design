<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 王元亨
  Date: 2020/10/16
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工列表</title>
</head>
<body>
<h1>员工列表</h1>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
    </tr>

    <c:forEach items="${list}" var="e">
        <tr>
            <td>${e.employeeId}</td>
            <td>${e.firstName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
