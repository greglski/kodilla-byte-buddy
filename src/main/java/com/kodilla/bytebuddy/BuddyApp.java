package com.kodilla.bytebuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BuddyApp {

    public static void main(String[] args) {
        List<Book> books = BooksGenerator.generate(100);
        BooksFilter booksFilter = new BooksFilter(books);
        List<Book> filteredBooks = booksFilter.onlyBooksOlderThan(20);
        System.out.println(filteredBooks.size());
        SpringApplication.run(BuddyApp.class, args);
    }

}
