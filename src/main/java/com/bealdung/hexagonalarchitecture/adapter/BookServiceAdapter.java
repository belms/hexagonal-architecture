package com.bealdung.hexagonalarchitecture.adapter;

import com.bealdung.hexagonalarchitecture.core.Book;
import com.bealdung.hexagonalarchitecture.port.BookRepositoryPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class BookServiceAdapter implements BookRepositoryPort {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void create(String name, String author, int pages) {
        Book book = new Book();
        book.setName(name);
        book.setAuthor(author);
        book.setPages(pages);
        entityManager.persist(book);
    }

    @Override
    public Book getBook(Long userId) {
        return entityManager.find(Book.class, userId);
    }

}
