package demo.actions;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("userName");
        String passWord=req.getParameter("passWord");
        if(userName==null|| passWord==null){
            req.setAttribute("message","Please Login");
        }else if(userName =="liuru" && passWord =="111111"){
            req.getSession().setAttribute("userName",userName);
            req.getRequestDispatcher("/list.jsp").forward(req,resp);
        }else{
            req.setAttribute("message","Invalid userName or passWord");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
