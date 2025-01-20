package controllers;

import controllers.interfaces.IBookController;
import models.Book;
import repositories.interfaces.IBookRepository;

public class BookController implements IBookController {
    private final IBookRepository bookRepository;

    public BookController(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void manageBooks() {
        // managing and interacting // example
        Book book = new Book("1234567890123", "Clear Code", "Uncle Bob", "programming", true);
        bookRepository.addBook(book);
        // add upd and del
    }
} // book checker should add for users and update postgre with many books yes
