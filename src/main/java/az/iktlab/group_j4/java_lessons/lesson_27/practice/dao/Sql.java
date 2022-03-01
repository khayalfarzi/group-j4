package az.iktlab.group_j4.java_lessons.lesson_27.practice.dao;

import java.sql.SQLException;
import java.sql.Statement;

public interface Sql {

    Statement getStatement() throws SQLException;
}
