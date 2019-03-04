package niit.soft.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ASUS on 2018/11/5.
 */
@WebServlet(
        description="个人信息",
        urlPatterns={
                "/MyInfoServlet",
                "/myInfo"
        },
        initParams={
                @WebInitParam(name="Encoding",value="utf-8",description="字符编码")
        })
public class MyInfoServlet extends HttpServlet {
    private static final long seriaLVersionUID=1L;
    private String encoding;//定义字符编辑变量

    public void init(ServletConfig config)throws ServletException{
        this.encoding=config.getInitParameter("Encoding");
    }
    public void destroy(){
        this.encoding=null;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding(this.encoding);

        response.setContentType("text/html;charset="+this.encoding);

        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<head><title>我的个人信息</title></head>");
        out.println("<body>");
        out.println("<h1>我的个人信息</h1>");
        out.println("姓名：my<br>");
        out.println("性别：女<br>");
        out.println("单位：南工院<br>");
        out.println("</body>");
        out.println("</html>");
    }

}
