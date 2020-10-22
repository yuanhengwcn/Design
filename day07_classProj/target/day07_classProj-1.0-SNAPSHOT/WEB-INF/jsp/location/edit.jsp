<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 王元亨
  Date: 2020/10/17
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑Location</title>
</head>
<body>
<form class="form-horizontal">
    <div class="form-group">
        <label class="col-sm-2 control-label">街道地址</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" placeholder="街道地址" value="${myLocation.streetAddress}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">邮编</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" placeholder="邮编" value="${myLocation.postalCode}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">城市</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" placeholder="城市" value="${myLocation.city}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">省份</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" placeholder="省份" value="${myLocation.stateProvince}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">国家</label>
        <div class="col-sm-5">
            <select class="form-control" name="countryName">
                <option value="">请选择国家</option>
                <c:forEach items="${myLocation.list}" var="list">
                    <option value="${list.countryName}" ${list.con==locationVO.countryName ? "selected='selected'" : ""}>
                            ${list.countryName}
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
