package demo.views;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import demo.dao.BooksDao;
import demo.models.Book;
import java.util.ArrayList;
import java.util.List;

public class ListBooksPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          List<Book> list =BooksDao.getAll();
         req.setAttribute("book",list);
         req.getRequestDispatcher("/WEB-INF/pages/list.jsp").forward(req,resp);
    }

}
