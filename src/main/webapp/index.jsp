<%--
  Created by IntelliJ IDEA.
  User: hxq
  Date: 2019/5/13
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="account/findAll">测试SpringMVC</a>

<h3>测试包</h3>
<form action="account/savep" method="post">
    姓名：<input type="text" name="name" /><br>
    金额：<input type="text" name="money" /><br>
    <input type="submit" value="提交">

</form>
</body>
</html>
