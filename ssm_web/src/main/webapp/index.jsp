<%--
  Created by IntelliJ IDEA.
  User: 三殇
  Date: 2018/11/23
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>我是index首页</h4>
    <a href="/ssmMulitBuild/user/pid?pid=6">点我查询单个用户信息</a>
    <br>
    <a href="/ssmMulitBuild/user/all">点我查询所有用户信息</a>
    <br>
    <form method="post" action="/ssmMulitBuild/user/update">
        ID<input type="text" name="pid" placeholder="输入用户id"><br>
        性别<input type="text" name="gender">
        姓名<input type="text" name="name">
        生日<input type="text" name="birthday">
        <input type="submit" value="点击修改用户信息">
    </form>

</body>
</html>
