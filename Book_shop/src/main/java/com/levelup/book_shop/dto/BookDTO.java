package com.levelup.book_shop.dto;


import lombok.Data;

@Data
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private double price;
    private String genre;
}
