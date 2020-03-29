package com.bealdung.hexagonalarchitecture.core;

import com.bealdung.hexagonalarchitecture.port.BookRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepositoryPort bookRepository;

    public void create(String name, String role, int salary){
        bookRepository.create(name, role, salary);
    }
    public Book view(Long userId){
        return bookRepository.getBook(userId);
    }
}
