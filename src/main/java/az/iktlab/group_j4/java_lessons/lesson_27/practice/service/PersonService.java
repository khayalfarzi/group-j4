package az.iktlab.group_j4.java_lessons.lesson_27.practice.service;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.repo.PersonDao;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.entity.PersonEntity;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.mapper.PersonMapper;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.model.Person;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.util.Validator;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {

    private final PersonDao dao;

    public PersonService(PersonDao dao) {
        this.dao = dao;
    }

    public void savePerson(Person person) {

        Validator.checkPersonName(person.getName());

        PersonEntity entity = PersonMapper.mapToEntity(person);

        try {
            dao.save(entity);
            System.out.println("Person successfully saved");
        } catch (SQLException e) {
            System.out.println("Error occurred when save person");
            System.out.printf("Error message: %s", e.getMessage());
        }
    }

    public List<Person> showPeople() {
        List<PersonEntity> people = new ArrayList<>();

        try {
            people = dao.findAll();
        } catch (SQLException e) {
            System.out.println("Error occurred when select person");
            System.out.printf("Error message: %s", e.getMessage());
        }

        return PersonMapper.mapToDto(people);
    }
}
