package az.iktlab.group_j4.java_lessons.lesson_27.practice.mapper;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.entity.PersonEntity;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.model.Person;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.util.Validator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMapper {

    public static PersonEntity mapToEntity(Person person) {
        PersonEntity entity = new PersonEntity();

        entity.setAge(person.getAge());
        entity.setFatherName(person.getFatherName());
        entity.setGender(person.getGender());
        entity.setName(person.getName());
        entity.setSurname(person.getSurname());

        return entity;
    }

    public static List<PersonEntity> mapFromRsToEntity(ResultSet rs) throws SQLException {

        List<PersonEntity> people = new ArrayList<>();
        while (rs.next()) {
            people.add(new PersonEntity(rs.getLong("id"),
                    rs.getString("name"),
                    rs.getString("surname"),
                    rs.getString("father_name"),
                    rs.getInt("age"),
                    Validator.validateGender(rs.getString("gender"))));
        }
        return people;
    }

    public static List<Person> mapToDto(List<PersonEntity> people) {
        return people.stream()
                .map(person -> new Person(person.getName(), person.getSurname(), person.getFatherName(), person.getAge(), person.getGender()))
                .collect(Collectors.toList());
    }
}