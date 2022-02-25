package az.iktlab.group_j4.java_lessons.lesson_27.practice.service;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.PersonDao;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.model.Person;

import java.sql.SQLException;

public class PersonService {

    private final PersonDao dao;

    public PersonService(PersonDao dao) {
        this.dao = dao;
    }

    public void savePerson(Person person) {

        if (person.getName().length() < 3) {
            System.out.println("Person name can't be less than 3");
            return;
        }

        // all checks must be here

        try {
            dao.save(person);
            System.out.println("Person successfully saved");
        } catch (SQLException e) {
            System.out.println("Error occurred when save person");
            System.out.printf("Error message: %s", e.getMessage());
        }
    }
}
