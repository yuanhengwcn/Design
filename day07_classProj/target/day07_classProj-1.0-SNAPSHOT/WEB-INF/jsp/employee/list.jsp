<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工列表</title>

    <link href="/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script src="/static/jquery/jquery-3.3.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

    <script type="text/javascript">
        $(function () {
            //删除事件
            $("a.btn-delete").click(function () {
                if (confirm("你确定删除吗？")) {
                    location.href = "/employee/delete?id=" + $(this).attr("demo");
                }
            })

            //编辑
            $("a.btn-edit").click(function () {
                if (confirm("你确定编辑吗？")) {
                    location.href = "/employee/edit?id=" + $(this).attr("demo");
                }
            })
        })
    </script>
</head>
<body>
<h1>员工列表</h1>
<hr/>
<form class="form-inline" action="/search">
    <div class="form-group">
        <div class="input-group">
            <div class="input-group-addon">关键词</div>
            <%--下面的value是回传用的--%>
            <input type="text" class="form-control" placeholder="姓名" name="keyWord" value="${employeeVO.keyWord}">
        </div>
        <div class="input-group">
            <div class="input-group-addon">岗位</div>
            <select class="form-control" name="jobId">
                <option value="">请选择岗位</option>

                <%--用到了controller中查询的所有的工作，目的是展示，方便选择--%>
                <c:forEach items="${jobs}" var="job">

                    <option value="${job.jobId}" ${employeeVO.jobId == job.jobId ? "selected='selected'" : ""}>
                            ${job.jobTitle}
                    </option>

                </c:forEach>
            </select>
        </div>
        <div class="input-group">
            <div class="input-group-addon">部门</div>
            <select class="form-control" name="departmentId">
                <option value="">请选择部门</option>
                <c:forEach items="${departments}" var="department">
                    <option value="${department.departmentId}" ${employeeVO.departmentId == department.departmentId?"selected='selected'":""}>${department.departmentName}</option>
                </c:forEach>
            </select>
        </div>
    </div>
    <button type="submit" class="btn btn-primary">搜索</button>
</form>
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
    <c:forEach items="${pageInfo.list}" var="e">
        <tr>
            <td>${e.employeeId}</td>
            <td>${e.firstName}.${e.lastName}</td>
            <td>${e.email}</td>
            <td><fmt:formatDate value="${e.hireDate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
            <td>${e.jobTitle}</td>
            <td>${e.salary}</td>
            <td>${e.managerName}</td>
            <td>${e.departmentName}</td>
            <td>
                <a class="btn-edit" href="javascript:void(0)" demo="${e.employeeId}">
                    <span class="glyphicon glyphicon-edit"></span>
                </a>
                &nbsp;&nbsp;
                <a class="btn-delete" href="javascript:void(0)" demo="${e.employeeId}">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
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
                    <a href="/search?${url}&page=${pageInfo.pageNum-1}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
            </c:otherwise>
        </c:choose>

        <c:forEach begin="1" end="${pageInfo.pages}" var="i">
            <li ${i == pageInfo.pageNum ? "class='active'" : '' }>
                <a href="/search?${url}&page=${i}">${i}</a>
            </li>
        </c:forEach>


        <li>
            <a href="#" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
            </a>
        </li>
    </ul>
</nav>
</body>
</html>
