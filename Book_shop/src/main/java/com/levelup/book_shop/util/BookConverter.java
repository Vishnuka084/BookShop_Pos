package com.levelup.book_shop.util;

import com.levelup.book_shop.dto.BookDTO;
import com.levelup.book_shop.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookConverter {
    public BookDTO entityToDTO(Book book) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setAuthor(book.getAuthor());
        bookDTO.setPrice(book.getPrice());
        bookDTO.setGenre(book.getGenre());
        return bookDTO;
    }

    public Book dtoToEntity(BookDTO bookDTO) {
        Book book = new Book();
        book.setId(bookDTO.getId());
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setPrice(bookDTO.getPrice());
        book.setGenre(bookDTO.getGenre());
        return book;
    }
}
