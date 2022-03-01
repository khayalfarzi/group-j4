package az.iktlab.group_j4.java_lessons.lesson_27.practice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PgSql implements Sql{

    private static final String url = "jdbc:postgresql://localhost:5432/group_j4";
    private static final String user = "postgres";
    private static final String pass = "root";

    @Override
    public Statement getStatement() throws SQLException {
        Connection con = DriverManager.getConnection(url, user, pass);
        return con.createStatement();
    }
}
