<%@ page import="java.util.List" %>
<%@ page import="niit.soft.domain.Emp" %>
<%@ page import="niit.soft.factory.DaoFactory" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/15
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<link rel="stylesheet" href="../css/bootstrap.min.css"/>
	<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="pagination" class="niit.soft.util.MyPagination" scope="session"/>
<%
	String str=request.getParameter("Page");
	int Page=1;
	List<Emp> all=new ArrayList<Emp>();
	if(str==null){	
		all=DaoFactory.getEmpDaoInstance().findAll();
		int pageSize=5;
		all=pagination.getInitPage(all, Page, pageSize);
	}else{
		Page=pagination.getPage(str);
		all=pagination.getAppointPage(Page);
	}
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
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<%
			while(iter.hasNext()){
				Emp emp=iter.next();
		%>
			<tr>
				<td><%=emp.getEmpno() %></td>
				<td><%=emp.getEname() %></td>
				<td><%=emp.getJob() %></td>
				<td><%=emp.getHiredate() %></td>
				<td><%=emp.getSal() %></td>
				<td><%=emp.getComm() %></td>
				<td><a href="do_delete.jsp?id=<%=emp.getEmpno() %>">删除</a></td>
			</tr>			
		<%
			}
		%>	
		<tr>
			<td colspan="7" align="right"><%=pagination.printCtrl(Page, "empListPage.jsp") %></td>
		</tr>		
		</tbody>
		<tfoot>
			<tr>
				<td class="text-center" colspan="6">@copy 本人第一次使用bootstrap，版权所有，请勿拷贝！</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>