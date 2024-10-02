package com.levelup.book_shop.service;

import com.levelup.book_shop.dto.BookDTO;
import com.levelup.book_shop.entity.Book;
import com.levelup.book_shop.repository.BookRepository;
import com.levelup.book_shop.util.BookConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookConverter bookConverter;

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = bookConverter.dtoToEntity(bookDTO);
        book = bookRepository.save(book);
        return bookConverter.entityToDTO(book);
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(bookConverter::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setPrice(bookDTO.getPrice());
        book.setGenre(bookDTO.getGenre());
        return bookConverter.entityToDTO(bookRepository.save(book));
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
