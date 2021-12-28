package az.iktlab.group_j4.java_lessons.lesson_12.abstraction;

import java.math.BigDecimal;

public class Employee extends Human {

    private BigDecimal salary;

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public void read() {
        System.out.println("Employee read method");
    }

    @Override
    public void write() {
        System.out.println("Employee write method");
    }
}
