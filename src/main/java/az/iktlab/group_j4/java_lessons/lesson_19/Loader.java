package az.iktlab.group_j4.java_lessons.lesson_19;

import java.util.Arrays;
import java.util.List;

public class Loader {

    public static List<Person> load() {
        return Arrays.asList(
                new Person(1, "N1"),
                new Person(2, "N2"),
                new Person(3, "N3"));
    }
}
