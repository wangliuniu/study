package niit.soft.util;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by ASUS on 2018/11/12.
 */
@WebFilter(
dispatcherTypes = {
        DispatcherType.REQUEST,
        DispatcherType.FORWARD,
        DispatcherType.INCLUDE,
        DispatcherType.ERROR
        }
        ,
        urlPatterns={
                "/week10/welcome.jsp",
                "/week10/*"
        },
        initParams = {
                @WebInitParam(name = "Encoding", value = "utf-8", description = "字符编码")}
)
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req1 = (HttpServletRequest) resp;//向下转型
        HttpSession session = req1.getSession();//获取session对象
        if (session.getAttribute("user") != null) {
            chain.doFilter(req, resp);//如果登录则向下传递
        } else {//如果没有登录则进行跳转到登录页面上
            session.setAttribute("info", "请先进行登录操作！");
            req.getRequestDispatcher("../servlet2/login.jsp").forward(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
