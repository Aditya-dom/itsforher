package service;

import model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(Long id);

    void addBook(Book book);

    void updateBook(Book book);

    void deleteBook(Long id);
}
