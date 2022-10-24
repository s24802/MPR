package pl.edu.pjwstk.mprgr36.booksmpr36.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.edu.pjwstk.mprgr36.booksmpr36.model.Author;
import pl.edu.pjwstk.mprgr36.booksmpr36.model.Book;
import pl.edu.pjwstk.mprgr36.booksmpr36.model.enums.BookType;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {
    BookRepository bookRepository;

    @BeforeEach
    void setUp() {
        bookRepository = new BookRepository();
    }

    @Test
    void Should_CreateBookWithCorrectInput() {
        //given
        Book b = new Book();
        //when
        b = bookRepository.createBook(b);
        //then
        assertNotNull(b.getId());
    }

    @Test
    void Should_getAllBooks() {
        List<Book> books;
        books = bookRepository.getAllBooks();
        assertNotNull(books);
    }

    @Test
    void deleteBooks() {
        Book b = new Book();
        bookRepository.createBook(b);
        bookRepository.deleteBook(b.getId());
        assertNull(bookRepository.getBookById(b.getId()));
    }

    @Test
    void getBookById() {
        Book b = new Book();
        bookRepository.createBook(b);
        assertNotNull(bookRepository.getBookById(b.getId()));
    }

    @Test
    void updateBook() {
        Book b = new Book();
        bookRepository.createBook(b);
        b.setAuthor(new Author());
        b.setTitle("test");
        b.setPublisher("test");
        b.setType(BookType.CHILDREN);
        Author a = new Author();
        AuthorRepository authorRepository = new AuthorRepository();
        b.setAuthor(authorRepository.createAuthor(new Author()));
        bookRepository.updateBook(b.getId(), b);
        assertEquals("test", bookRepository.getBookById(b.getId()).getTitle());
        assertEquals("test", bookRepository.getBookById(b.getId()).getPublisher());
        assertEquals(BookType.CHILDREN, bookRepository.getBookById(b.getId()).getBookType());
    }
}