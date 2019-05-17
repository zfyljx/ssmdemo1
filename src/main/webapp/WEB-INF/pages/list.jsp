<%--
  Created by IntelliJ IDEA.
  User: hxq
  Date: 2019/5/13
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询了所有账户</h3>
<c:forEach items="${accounts}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>
