package org.kremlevmax.librarymanagement.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Book {
    private int book_id;

    @NotEmpty(message = "Author field can't be empty")
    private String author;

    @NotEmpty(message = "Title field can't be empty")
    private String title;

    @NotEmpty(message = "Year field can't be empty")
    @Min(value = 1, message = "Year can't be negative")
    private int year;

    public Book() {

    }

    public Book(int id, String author, String title, int year) {
        this.book_id = id;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
