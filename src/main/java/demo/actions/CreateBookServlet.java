package demo.actions;

import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import demo.dao.BooksDao;
        import demo.models.Book;

public class CreateBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title=req.getParameter("title");
        String Description=req.getParameter("Description");
        Book book=new  Book();
        book.setTitle(title);
        book.setDescription(Description);
        BooksDao.add(book);
        resp.sendRedirect("/");
    }

}