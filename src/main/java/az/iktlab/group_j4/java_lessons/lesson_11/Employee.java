package az.iktlab.group_j4.java_lessons.lesson_11;

import java.math.BigDecimal;

public class Employee extends Person{

    private BigDecimal salary;

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
