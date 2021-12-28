package az.iktlab.group_j4.java_lessons.lesson_12.abstraction;

import az.iktlab.group_j4.java_lessons.lesson_12.Ability;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

//        Human human = new Human();

        Employee employee = new Employee();
        employee.setSalary(BigDecimal.valueOf(10_000));
        employee.read();

    }
}
