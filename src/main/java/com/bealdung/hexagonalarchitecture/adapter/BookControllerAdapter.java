package com.bealdung.hexagonalarchitecture.adapter;

import com.bealdung.hexagonalarchitecture.core.Book;
import com.bealdung.hexagonalarchitecture.core.BookService;
import com.bealdung.hexagonalarchitecture.port.BookRestPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books/")
public class BookControllerAdapter implements BookRestPort {
    @Autowired
    private BookService bookService;

    @Override
    public void create(@RequestBody Book request) {
        bookService.create(request.getName(), request.getAuthor(), request.getPages());
    }

    @Override
    public Book view(@PathVariable Long id) {
        return bookService.view(id);
    }
}
