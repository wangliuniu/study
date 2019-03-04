<%@ page import="java.util.List" %>
<%@ page import="niit.soft.domain.Emp" %>
<%@ page import="niit.soft.factory.DaoFactory" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/15
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="../css/bootstrap.min.css"/>
    <title>Title</title>
</head>
<body>
<%
    List<Emp> all= DaoFactory.getEmpDaoInstance().findAll();
    Iterator<Emp> iter=all.iterator();
%>
     <h2>员工信息显示</h2>
     <table class="table table-striped table-hover">
         <thead>
               <tr>
                   <th>工号</th>
                   <th>姓名</th>
                   <th>工作</th>
                   <th>入职日期</th>
                   <th>基本工资</th>
                   <th>奖金</th>
               </tr>
         </thead>
         <tbody>
         <%
             while(iter.hasNext()){
                 Emp emp=iter.next();
         %>
             <tr>
                 <td><%=emp.getEmpno()%></td>
                 <td><%=emp.getEname()%></td>
                 <td><%=emp.getJob()%></td>
                 <td><%=emp.getHiredate()%></td>
                 <td><%=emp.getSal()%></td>
                 <td><%=emp.getComm()%></td>
                 <td><a href="do_delete.jsp?id=<%=emp.getEmpno()%>">删除</a></td>
             </tr>
         <%
             }
         %>
         </tbody>
         <tfoot>
             <tr>
                 <td class="text-center" colspan="6">@cpoy 本人第一次使用bootstrap,版权所有，请勿拷贝！</td>
             </tr>
         </tfoot>
     </table>
</body>
</html>
