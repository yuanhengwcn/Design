<%--
  Created by IntelliJ IDEA.
  User: 飞鸟
  Date: 2020/10/29
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<html>
<head>
    <title>系统中心</title>
    <link rel="stylesheet" href="/static/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script type="text/javascript" src="/static/ztree/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="/static/ztree/js/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="/static/ztree/js/jquery.ztree.excheck.js"></script>
    <SCRIPT type="text/javascript">

        var setting = {
            check: {
                enable: true
            },
            data: {
                simpleData: {
                    enable: true
                }
            }
        };





        $(function(){
            var zNodes ;
            //发送ajax获取数据
            $.ajax({
                url:"/menus",
                dataType:"json",
                type:'get',
                async: false,
                success:function(ret){
                    zNodes = ret;
                }
            });


            $.fn.zTree.init($("#treeDemo"), setting, zNodes);
            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
            zTree.setting.check.chkboxType = { "Y" : "ps", "N" : "ps" };
        })

    </SCRIPT>
</head>


<body>
<h1>欢迎光临</h1>
用户名：<span style="color:red"><shiro:principal property="email"></shiro:principal></span>

<shiro:hasRole name="超级管理员">
    <a href="xxx">超级管理员入口</a>
</shiro:hasRole>
<a href="/logout">安全退出</a>

<hr>
<h3>权限操作</h3>
<a href="/menu/delete">菜单删除</a>
<a href="/menu/add">菜单添加</a>
<a href="/menu/update">菜单修改</a>
<br/>
<div class="zTreeDemoBackground left">
    <ul id="treeDemo" class="ztree"></ul>
</div>
</body>
</html>
