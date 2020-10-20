<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>地区列表</title>


    <link href="/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script src="/static/jquery/jquery-3.3.1.min.js"></script>
    <script src="/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>


</head>
<body>
<h1>LocationList</h1>
<hr/>


<form class="form-inline" action="/search">
    <div class="form-group">

        <div class="input-group">
            <div class="input-group-addon">国家名</div>
            <select class="form-control" name="countryName">
                <option value="">请选择国家名</option>

                <c:forEach items="${pageInfo.list}" var="l">

                    <option value="${l.countryName}" ${locationVO.countryName == l.countryName ? "selected='selected'" : ""}>
                            ${l.countryName}
                    </option>

                </c:forEach>
            </select>
        </div>

    </div>

    <button type="submit" class="btn btn-primary">搜索</button>
</form>


<%--下面是表--%>
<table class="table table-hover table-bordered">
    <tr>
        <th>街区</th>
        <th>邮编</th>
        <th>市名</th>
        <th>省名</th>
        <th>国名</th>
    </tr>
    <c:forEach items="${pageInfo.list}" var="e">
        <tr>
            <td>${e.streetAddress}</td>
            <td>${e.postalCode}</td>
            <td>${e.city}</td>
            <td>${e.stateProvince}</td>
            <td>${e.countryName}</td>

            <td>
                <a class="btn-edit" href="javascript:void(0)" demo="${e.countryName}">
                    <span class="glyphicon glyphicon-edit"></span>
                </a>
                &nbsp;&nbsp;
                <a class="btn-delete" href="javascript:void(0)" demo="${e.countryName}">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
