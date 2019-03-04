package niit.soft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by ASUS on 2018/11/9.
 */
@WebServlet(name = "DoSetInfoServlet"
        ,urlPatterns={"/week10/do_setInfo"})
public class DoSetInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //获取表单提交的各个参数
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        int age = Integer.parseInt(request.getParameter("age"));
       // 将所有的参数设置为session属性范围
        HttpSession session=request.getSession();
        session.setAttribute("name",name);
        session.setAttribute("gender",gender);
        session.setAttribute("age",age);
        //跳转到指定页面，将数据呈现出来
        response.sendRedirect("showinfo.jsp");





    }
}
