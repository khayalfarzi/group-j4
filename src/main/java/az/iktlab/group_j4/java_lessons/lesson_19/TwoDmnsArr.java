package az.iktlab.group_j4.java_lessons.lesson_19;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoDmnsArr {
    public static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 5, 7),
                Arrays.asList(2, 3, 4),
                Arrays.asList(6, 8, 4));

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if (list.get(i).get(j) == 4)
                    System.out.printf("[%s , %s]", j, i);
            }
        }
    }
}