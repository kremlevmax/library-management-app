package org.kremlevmax.librarymanagement.controllers;

import org.kremlevmax.librarymanagement.dao.BookDAO;
import org.kremlevmax.librarymanagement.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    BookDAO dao;

    @Autowired
    public BookController(BookDAO dao) {
        this.dao = dao;
    }

    @GetMapping
    public String getAllBooks(Model model) {
        List<Book> books = dao.getAllBooks();
        model.addAttribute("books", books);
        return "books/allBooks";
    }

    @GetMapping("/{id}")
    public String getBook(@PathVariable("id") int id, Model model){
        Book book = dao.getOneBook(id);
        model.addAttribute("book", book);
        return "books/oneBook";
    }


}
