package az.iktlab.group_j4.java_lessons.lesson_27.practice.dao;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.model.Person;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.util.SqlQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonDao {
    private static final String url = "jdbc:postgresql://localhost:5432/group_j4";
    private static final String user = "postgres";
    private static final String pass = "root";

    public void save(Person person) throws SQLException {

        Connection con = DriverManager.getConnection(url, user, pass);
        Statement stmt = con.createStatement();

        stmt.execute(SqlQuery.insertPerson(person));
    }
}
