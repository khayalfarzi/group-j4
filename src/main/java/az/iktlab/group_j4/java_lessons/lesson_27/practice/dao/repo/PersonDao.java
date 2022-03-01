package az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.repo;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.PgSql;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.Sql;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.entity.PersonEntity;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.mapper.PersonMapper;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.util.SqlQuery;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.util.Validator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDao {

    Sql sql = new PgSql();

    public void save(PersonEntity person) throws SQLException {
        Statement stmt = sql.getStatement();

        stmt.execute(SqlQuery.insertPerson(person));
    }

    public List<PersonEntity> findAll() throws SQLException {
        Statement statement = sql.getStatement();

        ResultSet rs = statement.executeQuery(SqlQuery.findAll());

        return PersonMapper.mapFromRsToEntity(rs);
    }
}
