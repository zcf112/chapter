<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/9/21
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <c:if test="${!empty error}">
        <font color="red">
            <c:out value="${error}"/>
        </font>
    </c:if>
    <form action="<c:url value="/loginCheck.html"/> "method="post">
        用户名:
        <input type="text" name="userName">
        <br>
        密码：
        <input type="password" name="password">
        <br>
        <input type="submit" value="登录">
        <input type="reset" value="重置">
    </form>
</body>
</html>
