<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>EditLocation</title>
</head>
<body>
<form class="form-horizontal">
    <div class="form-group">
        <label class="col-sm-2 control-label">街道地址</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" placeholder="街道地址" value="${location.streetAddress}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">邮编</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" placeholder="邮编" value="${location.postalCode}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">城市</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" placeholder="城市" value="${location.city}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">省份</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" placeholder="省份" value="${location.stateProvince}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">国家</label>
        <div class="col-sm-5">
            <select class="form-control" name="countryName">
                <option value="">请选择国家</option>
                <c:forEach items="${location.list}" var="list">
                    <option value="${list.countryName}" ${list.con==location.countryName ? "selected='selected'" : ""}>
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
