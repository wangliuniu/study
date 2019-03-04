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
    邮  箱 ：<input type="text" name="user"/><br>
    密  码：<input type="password" name="psd"/><br>
    权  限：<select name="quanxian">
        <option value="普通">普通</option>
        <option value="VIP">VIP</option>
        <option value="管理员">管理员</option>
    </select>
    <br>

    <input type="submit" value="登录"><br>

    <%--<%
        String info=session.getAttribute("info").toString();
        if(info!=null){
            %>
    <%=info %>
    <%
        }
    %>--%>
    ${info}
</form>
</body>
</html>
