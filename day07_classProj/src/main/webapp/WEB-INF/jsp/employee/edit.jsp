<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 王元亨
  Date: 2020/10/16
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>地点员工</title>

    <link href="/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script src="/static/jquery/jquery-3.3.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>
<h1>地点编辑</h1>
<hr/>
<%--注意，这里的编辑页面并没有实现保存功能，只是进行了信息的展示--%>
<form class="form-horizontal">
    <div class="form-group">
        <label class="col-sm-2 control-label">用户名</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" placeholder="姓" value="${employee.firstName}">
        </div>
        <div class="col-sm-2">
            <input type="text" class="form-control" placeholder="名" value="${employee.lastName}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">邮箱</label>
        <div class="col-sm-5">
            <input type="email" class="form-control" placeholder="邮箱" value="${employee.email}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">电话号码</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" placeholder="电话" value="${employee.phoneNumber}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">日期</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" value="<fmt:formatDate value="${employee.hireDate}" pattern="yyyy-MM-dd"></fmt:formatDate>">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">岗位</label>
        <div class="col-sm-5">
            <select class="form-control" name="jobId">
                <option value="">请选择岗位</option>
                <c:forEach items="${jobs}" var="job">
                    <option value="${job.jobId}" ${job.jobId==employee.jobId ? "selected='selected'" : ""}>
                        ${job.jobTitle}
                    </option>
                </c:forEach>
            </select>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">部门</label>
        <div class="col-sm-5">
            <select class="form-control" name="departmentId">
                <option value="">请选择部门</option>
                <c:forEach items="${departments}" var="department">
                    <option value="${department.departmentId}" ${department.departmentId==employee.departmentId ? "selected='selected'" : ""}>
                            ${department.departmentName}
                    </option>
                </c:forEach>
            </select>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="button" class="btn btn-default">
                编辑
            </button>
        </div>
    </div>
</form>
</body>
</html>
