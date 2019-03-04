<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/12
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="do_message" method="post">
    <h2>留言簿</h2>
    主题：<input type="text" name="title"><br>
    内容：<br>
    <textarea rows="5" cols="50" name="content">请留言</textarea><br>
    <br>
    <input type="submit" value="提交">
</form>

</body>
</html>
