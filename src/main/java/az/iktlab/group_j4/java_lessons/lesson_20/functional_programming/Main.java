package az.iktlab.group_j4.java_lessons.lesson_20.functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> lessThanFive = integer -> integer <= 10;
        Predicate<Integer> moreThanTen = integer -> integer >= 5;
        Predicate<Integer> lessThanTenAndMoreThanFive = i -> i <= 10 && i >= 5;

        List<Integer> list = Arrays.asList(1, 8, 9, 2, 3, 5, 6, 4, 12, 89, 15);

//        for (int i = 0; i < list.size(); i++) {
//            if (lessThanFive.test(list.get(i)))
//                System.out.println(list.get(i));
//        }
//
//        list.forEach(number -> {
//            if (lessThanFive.test(number))
//                System.out.println(number);
//        });

        list.stream()
                .filter(lessThanTenAndMoreThanFive)
                .forEach(System.out::println);
    }
}
