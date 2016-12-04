package demo.dao;

import java.util.ArrayList;
import java.util.List;
import demo.models.*;
public class BooksDao{

    static List<Book> list =new ArrayList<Book>();
    static int ID=1;
    public static void add(Book book) {
        book.setID(ID);
        ID=ID+1;
        list.add(book);


    }

    public static List<Book> getAll(){

        return list;
    }
}