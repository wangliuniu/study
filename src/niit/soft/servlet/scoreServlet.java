package niit.soft.servlet;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ASUS on 2018/11/8.
 */
@WebServlet(
        description="个人信息",
        urlPatterns={
                "/servlet",
                "/scoreServlet"
        },
        initParams={
                @WebInitParam(name="Encoding",value="utf-8",description="字符编码")
        })
public class scoreServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String java=request.getParameter("java");
        String web=request.getParameter("web");
        String math1=request.getParameter("math1");
        String english1=request.getParameter("english1");
        String sport1=request.getParameter("sport1");

        String data=request.getParameter("data");
        String wangluo=request.getParameter("wangluo");
        String math2=request.getParameter("math2");
        String english2=request.getParameter("english2");
        String sport2=request.getParameter("sport2");

        PrintWriter out=response.getWriter();
        out.println("<h1>大一成绩显示</h1><br>");

        out.println("<h1>大二成绩显示</h1>");
        out.println("<table border='1'cellspacing='0' cellpadding='0'>"+"<tr>"+"<th>序号</th>"+"<th>课程</th>"+"<th>分数</th>"+"</tr>");
        out.println(
                "<th>2</th><th>面向对象程序设计</th><th>"+java+"</th></tr>"+
                        "<th>2</th><th>Web程序应用</th><th>"+web+"</th></tr>"+
                        "<th>3</th><th>高等数学</th><th>"+math1+"</th></tr>"+
                        "<th>4</th><th>高职英语</th><th>"+english1+"</th></tr>"+
                        "<th>5</th><th>体育</th><th>"+sport1+"</th></tr>"
        );
        out.println("</table><br>");

        out.println("<h2>大一下学期</h2>");
        out.println("<table border='1'cellspacing='0' cellpadding='0'>"+"<tr>"+"<th>序号</th>"+"<th>课程</th>"+"<th>分数</th>"+"</tr>");
        out.println(
                "<th>6</th><th>数据库应用</th><th>"+data+"</th></tr>"+
                        "<th>7</th><th>网络应用基础</th><th>"+wangluo+"</th></tr>"+
                        "<th>8</th><th>高等数学</th><th>"+math2+"</th></tr>"+
                        "<th>9</th><th>高职英语</th><th>"+english2+"</th></tr>"+
                        "<th>10</th><th>体育</th><th>"+sport2+"</th></tr>"
        );
        out.println("<br>");
        out.println("</table>");
        out.flush();
        out.close();

    }
}