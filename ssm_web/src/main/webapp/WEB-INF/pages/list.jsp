<%--
  Created by IntelliJ IDEA.
  User: 三殇
  Date: 2018/11/23
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>显示所有账户信息</h2><br>
    <c:forEach items="${list}" var="user">
        ${user.pid}<br>
        ${user.gender}<br>
        ${user.name}<br>
        ${user.birthday}<br>
        <hr>
    </c:forEach>

</body>
</html>
