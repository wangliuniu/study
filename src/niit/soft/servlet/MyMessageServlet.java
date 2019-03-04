package niit.soft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lenovo on 2018/11/12.
 */
@WebServlet(name = "MyMessageServlet"
        ,urlPatterns = { "/week11/do_message" })
public class MyMessageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public MyMessageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title=request.getParameter("title");
        String content=request.getParameter("content");
//		将获取的参数保存为request范围
        request.setAttribute("title", title);
        request.setAttribute("content", content);
        request.getRequestDispatcher("showMessage.jsp").forward(request, response);
    }

}

