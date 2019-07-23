<%@ page import="org.springframework.ui.Model" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.zyq.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/7/22
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>用户主页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="keywords" content="fly,layui,前端社区">
    <meta name="description" content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
    <link rel="stylesheet" href="/ui/res/layui/css/layui.css">
    <link rel="stylesheet" href="/ui/res/css/global.css">
</head>
<body style="margin-top: 65px;">


<div class="fly-header layui-bg-black">
    <div class="layui-container">
        <a class="fly-logo" href="/ui/html/index.jsp?id=${user.id}">
            <img src="/ui/res/images/logo.png" alt="layui">
        </a>
        <ul class="layui-nav fly-nav layui-hide-xs">
            <li class="layui-nav-item layui-this">
                <a href="#"><i class="iconfont icon-jiaoliu"></i>联系管理员</a>
            </li>
            <li class="layui-nav-item">
                <a href="#"><i class="iconfont icon-iconmingxinganli"></i>我要合作</a>
            </li>
            <li class="layui-nav-item">
                <a href="#" target="_blank"><i class="iconfont icon-ui"></i>意见/建议</a>
            </li>
        </ul>

        <ul class="layui-nav fly-nav-user">
            <!-- 登入后的状态 -->
            <li class="layui-nav-item">
                <a class="fly-nav-avatar" href="javascript:;">
                    <cite class="layui-hide-xs">${user.userName}</cite>
                    <i class="iconfont icon-renzheng layui-hide-xs" title="认证信息：${user.message}"></i>
                    <i class="layui-badge fly-badge-vip layui-hide-xs">${user.vip}</i>
                    <%--这里是小头像--%>
                    <img src="${user.smallHead}">
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="../user/set.html"><i class="layui-icon">&#xe620;</i>基本设置</a></dd>
                    <dd><a href="../user/message.html"><i class="iconfont icon-tongzhi" style="top: 4px;"></i>我的消息</a></dd>
                    <dd><a href="../user/home.html"><i class="layui-icon" style="margin-left: 2px; font-size: 22px;">&#xe68e;</i>我的主页</a></dd>
                    <hr style="margin: 5px 0;">
                    <dd><a href="" style="text-align: center;">退出</a></dd>
                </dl>
            </li>
        </ul>
    </div>
</div>

<div class="fly-home fly-panel" style="background-image: url();">
    <%--这里是大头像 120120--%>
    <img src="${user.bigHead}" alt="${user.userName}">
    <i class="iconfont icon-renzheng" title="Fly社区认证"></i>
    <h1>
        ${user.userName}
        <i class="iconfont icon-nan"></i>
        <!-- <i class="iconfont icon-nv"></i>  -->
        <i class="layui-badge fly-badge-vip">VIP3</i>
        <!--
        <span style="color:#c00;">（管理员）</span>
        <span style="color:#5FB878;">（社区之光）</span>
        <span>（该号已被封）</span>
        -->
    </h1>

    <p style="padding: 10px 0; color: #5FB878;">认证信息：${user.message}</p>

    <p class="fly-home-info">
        <i class="iconfont icon-kiss" title="飞吻"></i><span style="color: #FF7200;">${user.kiss} 飞吻</span>
        <i class="iconfont icon-shijian"></i><span>${user.time} 加入</span>
        <i class="iconfont icon-chengshi"></i><span>${user.address}</span>
    </p>

    <p class="fly-home-sign">（${user.signature}）</p>

    <div class="fly-sns" data-user="">
        <a href="javascript:;" class="layui-btn layui-btn-primary fly-imActive" data-type="addFriend">加为好友</a>
        <a href="javascript:;" class="layui-btn layui-btn-normal fly-imActive" data-type="chat">发起会话</a>
    </div>

</div>

<div class="layui-container">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md6 fly-home-jie">
            <div class="fly-panel">
                <h3 class="fly-panel-title">${user.userName} 最近的提问</h3>
                <ul class="jie-row">
                    <c:forEach var="u" items="${userInvitationList}">
                    <li>
                        <span class="fly-jing">精</span>

                        <a href="" class="jie-title"> ${u.quiz}</a>
                        <i>${u.time}</i>
                        <em class="layui-hide-xs">${u.look}阅/${u.answer}答</em>
                    </li>
                    </c:forEach>
                </ul>
            </div>
        </div>


        <div class="layui-col-md6 fly-home-da">
            <div class="fly-panel">
                <h3 class="fly-panel-title">${user.userName} 最近的回答</h3>
                <ul class="home-jieda">
                    <c:forEach var="s" items="${answerList}">
                    <li>
                        <p>
                            <span>${s.time}</span>
                            在<a href="" target="_blank">${s.quiz}</a>中回答：
                        </p>
                        <div class="home-dacontent">
                            ${s.answer}
                        </div>
                    </li>
                    </c:forEach>
                    <%--<li>
                        <p>
                            <span>5分钟前</span>
                            在<a href="" target="_blank">在Fly社区用的是什么系统啊?</a>中回答：
                        </p>
                        <div class="home-dacontent">
                            Fly社区采用的是NodeJS。分享出来的只是前端模版
                        </div>
                    </li>--%>

                    <!-- <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><span>没有回答任何问题</span></div> -->
                </ul>
            </div>
        </div>
    </div>
</div>


<script src="/ui/res/layui/layui.js"></script>
<script>
    layui.cache.page = 'user';
    layui.cache.user = {
        username: '游客'
        ,uid: -1
        ,avatar: '/ui/res/images/avatar/00.jpg'
        ,experience: 83
        ,sex: '男'
    };
    layui.config({
        version: "3.0.0"
        ,base: '../../res/mods/'
    }).extend({
        fly: 'index'
    }).use('fly');
</script>

</body>
</html>