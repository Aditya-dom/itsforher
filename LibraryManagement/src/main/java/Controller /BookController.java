package controller;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    // Request mappings for CRUD operations

    @GetMapping("/list")
    public String listBooks(Model model) {
        // Retrieve and display all books
        return "books";
    }
}
