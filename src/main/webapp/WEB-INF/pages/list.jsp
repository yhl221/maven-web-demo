<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<%@ page import="java.util.List"%>
<%@ page import ="demo.models.Book"%>
<%
List
<Book> list = (List
    <Book>)request.getAttribute("book");
        %>
        <div>
            Welcome,<span><%= session.getAttribute("userName")%></span>
            <a href="#">Logout</a>
        </div>
        <br/>
        <div>
            <div>List All Books</div>
            <form action="/" method="post">
                <table border="1">
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Description</th>
                    </tr>
                    <% for(Book book: list) { %>
                    <tr>
                        <td><%= book.getID() %></td>
                        <td><%= book.getTitle() %></td>
                        <td><%= book.getDescription() %></td>
                    </tr>
                    <% } %>
                </table>
            </form>
        </div>
        <br/>
        <div>
            <div>
                Create New Book
            </div>
            <form action="/create-book" method="post">
                <div>
                    <label>Title</label>
                    <input type="text" name="title"/>
                </div>
                <br/>
                <div>
                    <label>Description</label>
                    <textarea name="Description" cols="30" rows="5"></textarea>
                </div>
                <br/>
                <button type="submit">Create</button>
            </form>
        </div>
</body>
</html>