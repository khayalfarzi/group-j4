package az.iktlab.group_j4.java_lessons.lesson_8;

import az.iktlab.group_j4.java_lessons.lesson_8.warmup.FactorialEx;
import org.junit.Assert;
import org.junit.Test;

import static az.iktlab.group_j4.java_lessons.lesson_8.warmup.FactorialEx.calcFactorial;
import static org.junit.Assert.assertEquals;

public class FactorialExTest {

    @Test
    public void testCalcFactorial() {
        assertEquals(6, calcFactorial(3));
        assertEquals(1, calcFactorial(1));
        assertEquals(120, calcFactorial(5));
    }
}
