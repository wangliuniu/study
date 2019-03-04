package niit.soft.servlet;

import javax.print.attribute.standard.RequestingUserName;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by ASUS on 2018/11/9.
 */
@WebServlet(name = "LoginServlet"
       , urlPatterns={
        "/doLogin"}
        )
public class LoginServlet extends HttpServlet {
    private  static final long serialVersionUID=1L;
    public LoginServlet(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String user=request.getParameter("user");
     String psd=request.getParameter("psd");

     if("demo@126.com".equals(user)&&"123".equals(psd)){
         request.setAttribute("user",user);//将用户名存储为reques
         //实例化RequestDispatcher对象，并指定跳转路径
         RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
         //实现服务器的跳转
         rd.forward(request,response);
     }else{
         HttpSession session=request.getSession();
         //设置错误信息
         session.setAttribute("info","用户名或密码错误");
         //实现客户端跳转
         response.sendRedirect("login.jsp");
     }
    }
}
