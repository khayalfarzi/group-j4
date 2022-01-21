package az.iktlab.group_j4.java_lessons.lesson_17;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> integers = new HashSet<>();

        integers.add(24);
        System.out.println(integers.add(1));
        System.out.println(integers.add(1));
        System.out.println(integers.add(1));

        integers.add(0);
        integers.add(3);
        integers.add(-25);
        System.out.println(integers);

        Set<String> strings = new HashSet<>();
        strings.add("b");
        strings.add("a");
        strings.add("c");

        Integer integer= 3;
        Integer integer1 = -5;
        System.out.println(integer.hashCode());
        System.out.println(integer1.hashCode());
        Set<Integer> integers1 = new HashSet<>();
        integers1.add(integer1);
        integers1.add(integer);

        System.out.println(integers1);

        System.out.println(strings);
    }
}
