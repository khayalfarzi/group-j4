package az.iktlab.group_j4.java_lessons.lesson_7;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<String, Integer> a = (s) -> s.length();
        Function<Integer, Integer> b = i -> i * 2;

        Function<String, Integer> then = a.andThen(b);

        System.out.println(then.apply("Java"));
    }
}
