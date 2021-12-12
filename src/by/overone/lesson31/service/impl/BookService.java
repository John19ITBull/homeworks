package by.overone.lesson31.service.impl;

import by.overone.lesson31.entity.Book;
import by.overone.lesson31.exception.BookNotFoundException;
import by.overone.lesson31.repository.IBookRepository;
import by.overone.lesson31.repository.impl.BookRepository;
import by.overone.lesson31.service.IBookService;

import java.util.List;

public class BookService implements IBookService {

    private static final IBookRepository bookRepository = new BookRepository();

    @Override
    public List<Book> readAll() {
        return bookRepository.readAll();
    }

    @Override
    public List<Book> readByAuthor(String authorName) {
        List<Book> books = bookRepository.readByAuthor(authorName);
        if (books.size() == 0) {
            throw new BookNotFoundException("Invalid author");
        }
        return books;
    }

    @Override
    public List<Book> deleteBook(int id) {
        List<Book> books = bookRepository.deleteBook(id);
        if (books.size() == 0) {
            throw new BookNotFoundException("Invalid id");
        }
        return books;
    }

    @Override
    public List<Book> updateBook(int id) {
        List<Book> books = bookRepository.updateBook(id);
        if (books.size() == 0) {
            throw new BookNotFoundException("Invalid id");
        }
        return books;
    }

    @Override
    public List<Book> addBook() {
        return bookRepository.addBook();
    }

}
