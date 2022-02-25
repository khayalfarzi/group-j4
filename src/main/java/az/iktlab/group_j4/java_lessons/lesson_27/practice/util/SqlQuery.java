package az.iktlab.group_j4.java_lessons.lesson_27.practice.util;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.model.Person;

public class SqlQuery {

    public static String insertPerson(Person person) {
        return String.format("INSERT INTO PERSON (NAME, ...) VALUES ('%S')", person.getName());
    }
}
