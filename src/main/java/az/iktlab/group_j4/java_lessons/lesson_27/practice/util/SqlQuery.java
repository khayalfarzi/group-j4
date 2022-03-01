package az.iktlab.group_j4.java_lessons.lesson_27.practice.util;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.entity.PersonEntity;

public class SqlQuery {

    public static String insertPerson(PersonEntity person) {
        return String.format("INSERT INTO j4_sc.PERSON (name, surname, father_name, age, gender) " +
                        "VALUES ('%S', '%s', '%s', %s, '%s')",
                person.getName(),
                person.getSurname(),
                person.getFatherName(),
                person.getAge(),
                person.getGender());
    }

    public static String findAll() {
        return "select * from j4_sc.person";
    }

    public static String createPersonTable() {
        return "create table IF NOT EXISTS j4_sc.person\n" +
                "(\n" +
                "    id          serial PRIMARY KEY,\n" +
                "    name        varchar(32) NOT NULL,\n" +
                "    surname     varchar(32) NOT NULL,\n" +
                "    age         smallint,\n" +
                "    father_name varchar(32),\n" +
                "    gender      varchar(7)\n" +
                ")";
    }
}
