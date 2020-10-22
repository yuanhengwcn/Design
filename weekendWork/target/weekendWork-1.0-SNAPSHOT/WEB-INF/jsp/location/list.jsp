<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>地区列表</title>


    <link href="/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script src="/static/jquery/jquery-3.3.1.min.js"></script>
    <script src="/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

    <script type="text/javascript">
        $(function () {
            //删除事件
            $("a.btn-delete").click(function () {
                if (confirm("你确定删除吗？")) {

                    location.href = "delete?countryName=" + $(this).attr("demo");
                }
            })

            //编辑
            $("a.btn-edit").click(function () {
                if (confirm("你确定编辑吗？")) {

                    location.href = "edit?countryName=" + $(this).attr("demo");
                }
            })
        })
    </script>
</head>
<body>
<h1>LocationList</h1>
<hr/>

<%--下面是搜索框--%>
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

<%--下面是导航栏--%>
<nav aria-label="Page navigation">
    <ul class="pagination">
        <!--
        keyword=zfa&jobId=AC_ACCOUNT&departmentId=20
        -->
        <c:choose>
            <c:when test="${pageInfo.isFirstPage}">
                <li class="disabled">
                    <a href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
            </c:when>
            <c:otherwise>
                <li>
                    <a href="/search?&pageNum=${pageInfo.pageNum-1}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
            </c:otherwise>
        </c:choose>

        <c:forEach begin="1" end="${pageInfo.pages}" var="i">
            <li ${i == pageInfo.pageNum ? "class='active'" : '' }>
                <a href="/search?&pageNum=${i}">${i}</a>
            </li>
        </c:forEach>


        <li>
            <a href="/search?&pageNum=${pageInfo.pageNum+1}" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
            </a>
        </li>
    </ul>
</nav>
</body>
</html>
