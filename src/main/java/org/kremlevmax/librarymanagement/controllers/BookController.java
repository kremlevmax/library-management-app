package org.kremlevmax.librarymanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/books")
public class BookController {

    @GetMapping
    public String getAllBooks() {
        return "books/all";
    }


}
