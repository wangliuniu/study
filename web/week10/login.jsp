<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/11/9
  Time: 8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="dologin" method="post">
    <h2 style="font-size: 20px">登录</h2>
    用户名：<input type="text" name="user"/><br>
    密  码：<input type="password" name="psd"/><br>

    <input type="submit" value="登录"><br>
    <input type="reset" value="重置"><br>
    ${info}
</form>
</body>
</html>
<%--<%
    String info=session.getAttribute("info").toString();
    if(info!=null){
        %>
<%=info %>
<%
    }
%>--%>