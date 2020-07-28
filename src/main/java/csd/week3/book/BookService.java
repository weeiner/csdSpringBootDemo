package csd.week3.book;

import java.util.List;

public interface BookService {
    List<Book> listBooks();
    Book getBook(Long id);
    Book addBook(Book book);
    Book updateBook(Long id, Book book);
    Book deleteBook(Long id);
}