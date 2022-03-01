package az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.repo;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.PgSql;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.Sql;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.util.SqlQuery;

import java.sql.SQLException;
import java.sql.Statement;

public class StartupLoaderDao {

    Sql sql = new PgSql();

    public void createTables() throws SQLException {
        Statement statement = sql.getStatement();

        statement.execute(SqlQuery.createPersonTable());
    }
}
