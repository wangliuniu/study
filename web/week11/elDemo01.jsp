<%@ page import="niit.soft.domain.Student" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/16
  Time: 8:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("info","123");
    request.setAttribute("soft","ruanjian1721");
    application.setAttribute("soft","软件1721");
    Student stu=new Student("张三","南工院");
    session.setAttribute("info",stu);

    response.sendRedirect("elDemo02.jsp");   //客户端跳转
%>
    info=${pageScope.info}<br>
    soft=${requestScope.soft}<br>
    info=${sessionScope.info}<br>
    soft=${applicationScope.soft}
<%--<jsp:forward page="elDemo02.jsp"/>--%>    //服务器跳转
</body>
</html>
