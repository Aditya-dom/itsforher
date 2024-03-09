package dao;

import model.Book;

import java.util.List;

public interface BookDAO {
    List<Book> getAllBooks();

    Book getBookById(Long id);

    void addBook(Book book);

    void updateBook(Book book);

    void deleteBook(Long id);
}
