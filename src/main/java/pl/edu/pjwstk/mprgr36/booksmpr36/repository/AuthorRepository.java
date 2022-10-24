package pl.edu.pjwstk.mprgr36.booksmpr36.repository;
import pl.edu.pjwstk.mprgr36.booksmpr36.model.Author;

import java.util.HashMap;
import java.util.List;

public class AuthorRepository {
    HashMap<Long, Author>  authorHashMap = new HashMap<>();

    public Author createAuthor(Author author) {
    author.setId(findMaxId());
    authorHashMap.put(findMaxId(),author);
    return author;
    }
    public List<Author> getAllAuthors(){
        return authorHashMap.values()
        .stream().toList();
    }
    public void deleteAuthor(Long id) {
        authorHashMap.remove(id);
    }
    public Author getAuthorById(Long id) {
        return authorHashMap.get(id);
    }
    public Author updateAuthor(Author author) {
        authorHashMap.put(author.getId(),author);
        return author;
    }

    private Long findMaxId(){
        if(authorHashMap.size() == 0) {
            return 0L;
        }
    return authorHashMap.keySet().stream()
            .mapToLong(u -> u).max().getAsLong();

    }
}
