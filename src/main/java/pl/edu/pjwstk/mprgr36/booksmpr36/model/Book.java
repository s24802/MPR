package pl.edu.pjwstk.mprgr36.booksmpr36.model;

import pl.edu.pjwstk.mprgr36.booksmpr36.model.enums.BookType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Book {
    private String title;
    private Author author;
    private int Publishedyear;
    private LocalDateTime creationDate;
    private BookType bookType;
    private String Publisher;

    public Book(String title, Author author, int publishedyear, LocalDateTime creationDate, BookType bookType, String publisher) {
        this.title = title;
        this.author = author;
        Publishedyear = publishedyear;
        this.creationDate = creationDate;
        this.bookType = bookType;
        Publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishedyear() {
        return Publishedyear;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public BookType getBookType() {
        return bookType;
    }

    public String getPublisher() {
        return Publisher;
    }
}

