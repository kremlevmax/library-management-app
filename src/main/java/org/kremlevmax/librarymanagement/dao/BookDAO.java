package org.kremlevmax.librarymanagement.dao;

import org.kremlevmax.librarymanagement.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> getAllBooks() {
        return jdbcTemplate.query("SELECT * FROM Book", new BeanPropertyRowMapper<>(Book.class));
    }

    public Book getOneBook(int id) {
        return jdbcTemplate.query("SELECT * FROM Book WHERE book_id=?", new BeanPropertyRowMapper<>(Book.class), id).stream().findAny().orElse(null);
    }
}
