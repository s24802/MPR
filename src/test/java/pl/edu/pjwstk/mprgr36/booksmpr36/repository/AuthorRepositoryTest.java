package pl.edu.pjwstk.mprgr36.booksmpr36.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.edu.pjwstk.mprgr36.booksmpr36.model.Author;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuthorRepositoryTest {

    AuthorRepository authorRepository;

    @BeforeEach
    void setUp() {
        authorRepository = new AuthorRepository();
    }

    @Test
    void Should_CreateAuthorWithCorrectInput() {
        //given
        Author a = new Author();
        //when
        a = authorRepository.createAuthor(a);
        //then
        assertNotNull(a.getId());
    }

    @Test
    void Should_getAllAuthors() {
        List<Author> authors;
        authors = authorRepository.getAllAuthors();
        assertNotNull(authors);
    }

    @Test
    void deleteAuthor() {
        Author a = new Author();
        authorRepository.createAuthor(a);
        authorRepository.deleteAuthor(a.getId());
        assertNull(authorRepository.getAuthorbyId(a.getId()));
    }

    @Test
    void getAuthorById() {
        Author a = new Author();
        authorRepository.createAuthor(a);
        assertNotNull(authorRepository.getAuthorbyId(a.getId()));
    }
}