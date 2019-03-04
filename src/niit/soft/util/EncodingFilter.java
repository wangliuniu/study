package niit.soft.util;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * Created by ASUS on 2018/11/9.
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
                "/*",
                "/week10/*",
                "/week11/*"
},
        initParams = {
                @WebInitParam(name="encoding",value="utf-8")
        }
)
public class EncodingFilter implements Filter {
    private String encoding;
    public EncodingFilter(){

    }
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
      request.setCharacterEncoding(this.encoding);
      response.setContentType("text/html;charset="+this.encoding);

      chain.doFilter(request,response);
    }

    public void init(FilterConfig fconfig) throws ServletException {
        this.encoding=fconfig.getInitParameter("encoding");


    }

}
