package az.iktlab.group_j4.java_lessons.lesson_20.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class Loader {

    public static List<Person> load() {
        return asList(
                new Person(158, "N1"),
                new Person(2, "N2"),
                new Person(3, "N3")
        );
    }

    public static Map<Integer, Person> loadMap() {
        Map<Integer, Person> map = new HashMap<>();
        load().forEach(person -> {
            map.put(person.getId(), person);
        });
        return map;
    }
}
