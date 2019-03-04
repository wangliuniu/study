<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/11/16
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    List<String> all=new ArrayList<>();
    all.add("aaa");
    all.add("bbb");
    all.add("ccc");
    all.add("ddd");
    all.add("eee");

    request.setAttribute("allList",all);

%>
<h3> 第一个元素： ${allList[0]}</h3>
<h3> 第三个元素： ${allList[2]}</h3>

<c:forEach items="${allList}" var="str" varStatus="id">
  <h3 style="color: pink;">
      第${id.index}个元素&nbsp;&nbsp;     ${str }

  </h3>
</c:forEach>
</hr/>
<c:forEach items="${allList}" var="str" varStatus="id">
    <h3 style="color: red;">
        第${id.count}个元素&nbsp;&nbsp;     ${str }

    </h3>
</c:forEach>
</hr/>
<c:forEach items="${allList}" var="str" varStatus="id">
    <h3 style="color: cyan;">
        第${id.first}个元素&nbsp;&nbsp;     ${str }

    </h3>
</c:forEach>
</hr/>
<c:forEach items="${allList}" var="str" varStatus="id">
    <h3 style="color: blue;">
        第${id.last}个元素&nbsp;&nbsp;     ${str }

    </h3>
</c:forEach>
</hr/>
</body>
</html>
