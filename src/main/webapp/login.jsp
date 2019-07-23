<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/7/22
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="ui/css/index.css"/>
</head>
<body>

<img class="bgone" src="ui/img/1.jpg"/>
<img class="pic" src="ui/img/a.png"/>

<div class="table">
    <div class="wel">MusicClub</div>
    <form ACTION="/login" name="/login" method="post">
        <div class="user">
            <div id="yonghu" style=""><img src="ui/img/yhm.png"/></div>
            <input type="text" name="loginName" placeholder="用户名"/>
        </div>
        <div class="password">
            <div id="yonghu"><img src="ui/img/mm.png"/></div>
            <input type="passWord" name="passWord" placeholder="*****"/>
        </div>
        <input class="btn" type="submit" name="Login" value="登录"/>
<%--        <input class="btn"  name="Login" value="游客"/>--%>
    </form>
</div>

</body>
</html>
