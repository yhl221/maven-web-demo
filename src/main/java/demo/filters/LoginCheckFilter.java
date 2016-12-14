package demo.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import  java.io.IOException;

public class LoginCheckFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)req;
        HttpSession session = httpRequest.getSession();
        HttpServletResponse res=(HttpServletResponse) resp;
        if(session.getAttribute("userName")!=null){
           // res.sendRedirect("/");
            filterChain.doFilter(httpRequest,res);
        }else{
            res.sendRedirect("/login.jsp");
        }
    }

    public void destroy() {

    }
}
