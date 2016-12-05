package demo.actions;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("userName");
        String passWord=req.getParameter("passWord");
        System.out.println(userName+passWord);
        if(userName==null|| passWord==null){
            req.setAttribute("message","Please Login");
            req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req,resp);
        }else if(userName.equals("liuru") && passWord.equals("111111")){
            req.getSession().setAttribute("userName",userName);
            resp.sendRedirect("/");
           // req.getRequestDispatcher("/WEB-INF/pages/list.jsp").forward(req,resp);
        }else{
            req.setAttribute("message","Invalid userName or passWord");
            req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req,resp);
        }
    }
}
