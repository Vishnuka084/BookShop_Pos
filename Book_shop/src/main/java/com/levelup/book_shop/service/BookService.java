package com.levelup.book_shop.service;

import com.levelup.book_shop.dto.BookDTO;

import java.util.List;

public interface BookService {
    BookDTO saveBook(BookDTO bookDTO);
    List<BookDTO> getAllBooks();
    BookDTO updateBook(Long id, BookDTO bookDTO);
    void deleteBook(Long id);
}
