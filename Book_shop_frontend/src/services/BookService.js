import axios from 'axios';

const API_URL = 'http://localhost:8080/api/books';

// Get all books
export const getBooks = () => axios.get(API_URL);

// Get book by ID
export const getBookById = (id) => axios.get(`${API_URL}/${id}`);

// Create a new book
export const createBook = (book) => axios.post(API_URL, book);

// Update an existing book
export const updateBook = (id, book) => axios.put(`${API_URL}/${id}`, book);

// Delete a book
export const deleteBook = (id) => axios.delete(`${API_URL}/${id}`);
