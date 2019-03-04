<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/11/9
  Time: 8:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>姓名：<%=session.getAttribute("name")%></h2>
<h2>性别：<%=session.getAttribute("gender")%></h2>
<h2>年龄：<%=session.getAttribute("age")%></h2>

</body>
</html>
