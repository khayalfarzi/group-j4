package az.iktlab.group_j4.java_lessons.lesson_21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIndex {

    public static void main(String[] args) {

        Set<Set<Integer>> rnd = new HashSet<>();

        rnd.add(new HashSet<>(Arrays.asList(1, 3, 5)));
        rnd.add(new HashSet<>(Arrays.asList(2, 8, 9)));
        rnd.add(new HashSet<>(Arrays.asList(4, 6, 22)));

        System.out.println(rnd);
    }
}
