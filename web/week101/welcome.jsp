<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/11/9
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Encoding">
    <title>Title</title>
</head>
<body>
<h1>登录信息：</h1>
<h1>邮箱：<%=request.getAttribute("user")%></h1>
<h1>权限：<%=request.getAttribute("quanxian")%></h1>

</body>
</html>
