<%@ page import="com.jspsmart.upload.SmartUpload" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/26
  Time: 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
<%
    SmartUpload up=new SmartUpload();//实例化SmartUpload组件
    up.initialize(pageContext);//初始化上传操作
    up.upload(); //上传准备
    String name = up.getRequest().getParameter("uname") ;
    String fileName=up.getFiles().getFile(0).getFileName();
    up.save("upload");//将文件保存到upload文件夹中
%>
<h2>姓名：<%=name%></h2>
<h2>request无法取得：<%=request.getParameter("uname")%></h2>

<img src="../upload/<%=fileName %>" >
</body>
</html>
