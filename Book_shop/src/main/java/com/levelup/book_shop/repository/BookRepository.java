package com.levelup.book_shop.repository;

import com.levelup.book_shop.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
