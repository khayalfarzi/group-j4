package az.iktlab.group_j4.java_lessons.lesson_11;

import java.math.BigDecimal;

public class Developer extends Employee {

    private BigDecimal bonus;

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
}
