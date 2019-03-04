<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/11/16
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String,String> map=new HashMap<>();
    map.put("1","aaa");
    map.put("b","bbb");
    map.put("3","ccc");
    request.setAttribute("myMap",map);
%>
<h2>关键字为1的数据值：${myMap["1"]}</h2>
<h2>关键字为2的数据值：${myMap.b}</h2>
</body>
</html>
