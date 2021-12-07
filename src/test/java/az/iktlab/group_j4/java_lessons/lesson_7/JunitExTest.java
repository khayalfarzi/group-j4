package az.iktlab.group_j4.java_lessons.lesson_7;

import org.junit.Assert;
import org.junit.Test;

import static az.iktlab.group_j4.java_lessons.lesson_7.JunitEx.findMax;
import static az.iktlab.group_j4.java_lessons.lesson_7.JunitEx.findMin;
import static org.junit.Assert.assertEquals;

public class JunitExTest {

    @Test
    public void testFindMax() {
        assertEquals(12, findMax(2, 12, 9));
        assertEquals(9, findMax(2, 6, 9));
        assertEquals(11, findMax(11, 6, 9));
    }

    @Test
    public void testFindMin() {
        assertEquals(1, findMin(3, 1));
        assertEquals(14, findMin(16, 14));
        assertEquals(12, findMin(35, 12));
    }
}
