package pl.edu.pjwstk.mprgr36.booksmpr36.model;

import pl.edu.pjwstk.mprgr36.booksmpr36.model.enums.BookType;

import java.time.LocalDateTime;

public class Book {

    private Long id;
    private String title;
    private Author author;
    private int Publishedyear;
    private LocalDateTime creationDate;
    private BookType bookType;
    private String publisher;
    public Book() {
    }
    public Book(String title, Author author, int publishedyear, LocalDateTime creationDate, BookType bookType, String publisher) {
        this.title = title;
        this.author = author;
        Publishedyear = publishedyear;
        this.creationDate = creationDate;
        this.bookType = bookType;
        this.publisher = publisher;
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
        return publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setType(BookType type) {
        this.bookType = type;
    }
}

