package pl.edu.pjwstk.mprgr36.booksmpr36.repository;


import pl.edu.pjwstk.mprgr36.booksmpr36.model.Book;

import java.util.HashMap;
import java.util.List;

public class BookRepository {
    HashMap<Long, Book> booksHashMap = new HashMap<>();

    public Book createBook(Book book) {
        book.setId(findMaxId());
        booksHashMap.put(findMaxId(), book);
        return book;
    }

    private Long findMaxId() {
        if (booksHashMap.size() == 0) {
            return 0L;
        }
        return booksHashMap.keySet().stream()
                .mapToLong(u -> u).max().getAsLong();

    }

    public List<Book> getAllBooks() {
        return booksHashMap.values()
                .stream().toList();
    }

    public void deleteBook(Long id) {
        booksHashMap.remove(id);
    }

    public Book getBookById(Long id) {
        return booksHashMap.get(id);
    }

    public Book updateBook(Long id, Book updatedBook) {
        Book bookToUpdate = getBookById(id);

        if (!bookToUpdate.getPublisher().equals(updatedBook.getPublisher())) {
            bookToUpdate.setPublisher(updatedBook.getPublisher());
        }
        if (!bookToUpdate.getTitle().equals(updatedBook.getTitle())) {
            bookToUpdate.setTitle(updatedBook.getTitle());
        }
        if (!bookToUpdate.getAuthor().getId().equals(updatedBook.getAuthor().getId())) {
            bookToUpdate.setAuthor(updatedBook.getAuthor());
        }
        return bookToUpdate;
    }
}
