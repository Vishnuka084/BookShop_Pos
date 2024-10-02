import React, { useState } from "react";
import { createBook } from "../services/BookService";
import { useNavigate } from "react-router-dom";

function AddBook() {
  const [book, setBook] = useState({ title: "", author: "", price: 0, genre: "" });
  const navigate = useNavigate();

  const handleChange = (e) => {
    setBook({ ...book, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    await createBook(book);
    navigate("/");
  };

  return (
    <form onSubmit={handleSubmit}>
      <input type="text" name="title" value={book.title} onChange={handleChange} placeholder="Title" />
      <input type="text" name="author" value={book.author} onChange={handleChange} placeholder="Author" />
      <input type="number" name="price" value={book.price} onChange={handleChange} placeholder="Price" />
      <input type="text" name="genre" value={book.genre} onChange={handleChange} placeholder="Genre" />
      <button type="submit">Add Book</button>
    </form>
  );
}

export default AddBook;
