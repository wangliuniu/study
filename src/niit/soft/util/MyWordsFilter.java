package niit.soft.util;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lenovo on 2018/11/12.
 */
@WebFilter(filterName = "MyWordsFilter",
        dispatcherTypes = {
                DispatcherType.REQUEST,
                DispatcherType.FORWARD,
                DispatcherType.INCLUDE,
                DispatcherType.ERROR
        }
        ,urlPatterns = { "/week11/*" })  //此过滤器对week11文件夹下的文件进行过滤
public class MyWordsFilter implements Filter {

    private String[] words; //定义需要过滤的字符串数组
    public MyWordsFilter() {
        // TODO Auto-generated constructor stub
    }

    public void destroy() {
        this.words=null;//将需要过滤的字符串组清空
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request=new Request((HttpServletRequest)request); //用新的request类去转换

        // pass the request along the filter chain
        chain.doFilter(request, response);
    }
    class Request extends HttpServletRequestWrapper{

        public Request(HttpServletRequest request) {
            super(request);

        }

        @Override
        public String getParameter(String name) {
//			将参数name进行过滤
            return filter(super.getParameter(name));
        }

        @Override
        public String[] getParameterValues(String name) {
            String values[]=super.getParameterValues(name);
            for(int i=0;i<values.length;i++){
                values[i]=filter(values[i]);
            }
            return super.getParameterValues(name);
        }




    }
    //对指定字符串过滤成**
    public String filter(String param){
        if(words!=null && words.length>0){
            for(int i=0;i<words.length;i++){
                if(param.indexOf(words[i])!=-1){
                    param=param.replaceAll(words[i], "**");
                }
            }
        }
        return param;
    }


    public void init(FilterConfig fConfig) throws ServletException {
        words=new String[]{"混蛋","小人"};
    }

}

