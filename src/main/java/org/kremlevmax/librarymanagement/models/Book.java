package org.kremlevmax.librarymanagement.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Book {
    private int id;

    @NotEmpty(message = "Author field can't be empty")
    private String author;

    @NotEmpty(message = "Title field can't be empty")
    private String title;

    @NotEmpty(message = "Year field can't be empty")
    @Min(value = 1, message = "Year can't be negative")
    private int year;
}
