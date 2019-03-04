<%@ page import="com.jspsmart.upload.SmartUpload" %>
<%@ page import="java.io.File" %>
<%@ page import="niit.soft.util.IpTimeStamp" %><%--
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
<jsp:useBean id="ts" class="niit.soft.util.TimeStamp" scope="page"/>
<%
    SmartUpload su=new SmartUpload();//1.实例化SmartUpload组件
    su.initialize(pageContext);//2.初始化上传操作
    su.setAllowedFilesList("jpg,png,gif,jpeg");//设定文件允许上传的后缀
    su.setMaxFileSize(100000);//设定文件上传的最大尺寸
    su.upload();//3.准备上传

    //String name=request.getParameter("name");  //此方法无法获取name参数的值
    String name=su.getRequest().getParameter("name");//获取name参数
    int count=su.getFiles().getCount();//获取上传的文件数
    IpTimeStamp its=new IpTimeStamp(request.getRemoteAddr());

    String ext=su.getFiles().getFile(0).getFileExt();//获取上传文件的后缀名
    String orgfilename=su.getFiles().getFile(0).getFileName();//获得上传文件名
    //String fileName=ts.getTimeStamp()+"."+ext;//拼凑新的文件名
    String fileName=its.getIpTimeStampRand()+"."+ext;
    //su.save("upload");                      //4.保存
    su.getFiles().getFile(0).saveAs(this.getServletConfig().getServletContext().getRealPath("/")+
            "upload"+File.separator+fileName);//另存为

     String ip=request.getRemoteAddr();

%>
<h2>ip=<%=ip %> <br>  </h2>
<h2>姓名：<%=name%></h2>
<h2>上传文件重命名为：<%=fileName %><br></h2>
上传图片为：<br>
<img src="../upload/<%=fileName %>" width="200" height="150"/>
</body>
</html>
