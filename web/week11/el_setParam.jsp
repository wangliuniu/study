<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/11/16
  Time: 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="el_getParam.jsp" method="post">
  姓名：<input type="text" name="name"> <br>
  性别：<input type="radio" name="gender" value="男" checked>男
       <input type="radio" name="gender" value="女">女<br>
    兴趣：<input type="checkbox" name="inst" value="唱歌">唱歌
    <input type="checkbox" name="inst" value="跳舞">跳舞
    <input type="checkbox" name="inst" value="阅读">阅读
    <input type="submit" value="提交">
</form>
</body>
</html>
