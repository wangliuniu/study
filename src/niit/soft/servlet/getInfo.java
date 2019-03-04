package niit.soft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ASUS on 2018/11/5.
 */
@WebServlet(name = "getInfo",
        urlPatterns={"/week10/getInfo"}
       )
public class getInfo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        int age = Integer.parseInt(request.getParameter("age"));

        PrintWriter out = response.getWriter();
        out.append("姓名：" + name);
        out.append("性别：" + gender);
        out.append("年龄：" + age);
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
