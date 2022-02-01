package az.iktlab.group_j4.java_lessons.lesson_20.functional_programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class FuncPerson {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1, "Khayal", 23),
                new Person(3, "Ali", 231),
                new Person(2, "Nijat", 67)
        );

        people.stream()
                .map(person -> person.getName())
                .forEach(System.out::println);

        System.out.println(
                people.stream()
                        .mapToInt(Person::getAge)
                        .average());

        people.stream()
                .filter(person -> person.getAge() > 20)
                .filter(person -> person.getName().contains("i"))
                .filter(person -> person.getName().toLowerCase().contains("a"))
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
