<%@ page import="niit.soft.factory.DaoFactory" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/19
  Time: 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="emp" class="niit.soft.domain.Emp"></jsp:useBean>
<jsp:setProperty name="emp" property="*"/>
<%
    emp.setEname(request.getParameter("ename"));
    emp.setJob(request.getParameter("job"));
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    String hiredate=request.getParameter("hiredate");
    Date date=sdf.parse(hiredate);
    emp.setHiredate(date);
    emp.setSal(Integer.parseInt((request.getParameter("sal"))));
    emp.setComm(Integer.parseInt(request.getParameter("comm")));
    DaoFactory.getEmpDaoInstance().insert(emp);
    response.sendRedirect("empList.jsp");
%>

</body>
</html>
