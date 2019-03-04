<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/11/16
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> 接受参数</h3>
<h3>姓名：<%=request.getParameter("name")%></h3>
<hr/>
<h3 style="color:red;">姓名：${param.name}</h3>
<h3 style="color:red;">性别：${param.gender}</h3>
<h3 style="color:red;">兴趣：${paramValues.inst[0]}&nbsp;&nbsp;
                               ${paramValues.inst[1]}&nbsp;&nbsp;
                               ${paramValues.inst[2]}&nbsp;&nbsp;

</h3>
</body>
</html>
