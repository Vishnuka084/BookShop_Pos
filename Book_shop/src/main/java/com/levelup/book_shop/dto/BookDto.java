package com.levelup.book_shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private Long id;
    private  String title;
    private  String author;
    private Double price;
    private Integer quantity;
}
