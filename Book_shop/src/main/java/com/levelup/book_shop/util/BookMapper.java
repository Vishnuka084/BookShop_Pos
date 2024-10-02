package com.levelup.book_shop.util;

import com.levelup.book_shop.dto.BookDto;
import com.levelup.book_shop.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public Book toEntity(BookDto bookDto) {
        return new Book(bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getPrice(),
                bookDto.getQuantity());
    }

    public BookDto toDto(Book book) {
        return new BookDto(book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPrice(),
                book.getQuantity());

    }
}
