package az.iktlab.group_j4.java_lessons.lesson_27.practice.model;

import java.util.Objects;

public class User {

    private Person person;
    private String username;
    private String password;

    public User() {
    }

    public User(Person person, String username, String password) {
        this.person = person;
        this.username = username;
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(person, user.person) && Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, username, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "person=" + person +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
