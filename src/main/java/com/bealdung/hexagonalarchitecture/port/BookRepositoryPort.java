package com.bealdung.hexagonalarchitecture.port;

import com.bealdung.hexagonalarchitecture.core.Book;

public interface BookRepositoryPort {
    void create(String name, String author, int salary);
    Book getBook(Long userId);
}
