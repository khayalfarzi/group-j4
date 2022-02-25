package az.iktlab.group_j4.java_lessons.lesson_27;

import java.sql.*;

public class JdbcConnection {

    public static void main(String[] args) {

        final String url = "jdbc:postgresql://localhost:5432/group_j4";
        String user = "postgres";
        String pass = "root";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);

            Statement stmt = con.createStatement();

            insertSql(stmt);

            selectSql(stmt);

            selectByIdSql(1L, stmt);

            selectAllSql(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void selectByIdSql(Long id, Statement stmt) throws SQLException {
        String sql = String.format("SELECT * FROM j4_sc.person where id = %s", id);

        ResultSet set = stmt.executeQuery(sql);

        while (set.next()) {

            Long idd = set.getLong("id");
            String name = set.getString("name");
            String surname = set.getString("surname");
            Integer age = set.getInt("age");

            System.out.println(String.format("id: %s, name: %s , surname: %s , age: %s", idd, name, surname, age));
            System.out.println();
        }
    }

    private static void selectAllSql(Statement stmt) throws SQLException {
        String sql = "SELECT * FROM j4_sc.person";

        ResultSet set = stmt.executeQuery(sql);

        while (set.next()) {
            Long idd = set.getLong("id");
            String name = set.getString("name");
            String surname = set.getString("surname");
            Integer age = set.getInt("age");

            System.out.printf("id: %s, name: %s , surname: %s , age: %s\n", idd, name, surname, age);
        }
    }

    private static void selectSql(Statement stmt) throws SQLException {
        String select = "SELECT * FROM j4_sc.person";

        System.out.println("Select: " + stmt.execute(select));
    }

    private static void insertSql(Statement stmt) throws SQLException {
        String insertQuery = "insert into j4_sc.person (name, surname, age)" +
                "VALUES ('Nigar', 'Rzayeva', 12)";

        System.out.println("Insert: " + stmt.execute(insertQuery));
    }
}
