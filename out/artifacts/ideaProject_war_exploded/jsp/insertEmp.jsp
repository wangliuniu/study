<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/19
  Time: 9:08
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
<form action ="do_insertEmp.jsp" method="post">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6">
            姓名：<input type="text" class="form-control" name="ename" required><br/>
            工作：<input type="text" class="form-control" name="job" required><br/>
            入职日期：<input type="date" class="form-control" name="hiredate" required><br/>
            基本工资：<input type="text" class="form-control" name="sql" required><br/>
            奖金：<input type="text" class="form-control" name="comm" required><br/>
            <button type="submit" class="btn btn-success btn-block">添加</button>
        </div>
        <div class="col-md-3"></div>
    </div>
</form>
</body>
</html>
