import React, { useEffect, useState } from "react";
import { getBookById, updateBook } from "../services/BookService";
import { useNavigate, useParams } from "react-router-dom";

function EditBook() {
  const [book, setBook] = useState({ title: "", author: "", price: 0, genre: "" });
  const { id } = useParams();
  const navigate = useNavigate();

  useEffect(() => {
    loadBook();
  }, []);

  const loadBook = async () => {
    const result = await getBookById(id);
    setBook(result.data);
  };

  const handleChange = (e) => {
    setBook({ ...book, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    await updateBook(id, book);
    navigate("/");
  };

  return (
    <form onSubmit={handleSubmit}>
      <input type="text" name="title" value={book.title} onChange={handleChange} />
      <input type="text" name="author" value={book.author} onChange={handleChange} />
      <input type="number" name="price" value={book.price} onChange={handleChange} />
      <input type="text" name="genre" value={book.genre} onChange={handleChange} />
      <button type="submit">Update Book</button>
    </form>
  );
}

export default EditBook;
