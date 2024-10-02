import React, { useEffect, useState } from "react";
import { getBooks, deleteBook } from "../services/BookService";
import { Link } from "react-router-dom";

function Home() {
  const [books, setBooks] = useState([]);

  useEffect(() => {
    loadBooks();
  }, []);

  const loadBooks = async () => {
    const result = await getBooks();
    setBooks(result.data);
  };

  const handleDelete = async (id) => {
    await deleteBook(id);
    loadBooks();
  };

  return (
    <div>
      <h1>Book List</h1>
      <Link to="/add-book">Add New Book</Link>
      <ul>
        {books.map((book) => (
          <li key={book.id}>
            {book.title} by {book.author}
            <Link to={`/edit-book/${book.id}`}>Edit</Link>
            <button onClick={() => handleDelete(book.id)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Home;
