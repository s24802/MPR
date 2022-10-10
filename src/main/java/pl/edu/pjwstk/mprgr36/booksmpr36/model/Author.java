package pl.edu.pjwstk.mprgr36.booksmpr36.model;

import pl.edu.pjwstk.mprgr36.booksmpr36.model.enums.Gender;

import java.time.LocalDateTime;

public class Author {
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDateTime birthDate;


    public Author () {

    }
    public Author(String firstName, String lastName, Gender gender, LocalDateTime birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;

    }
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
