package az.iktlab.group_j4.java_lessons.lesson_6.warmup;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AgeManipulationEx {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] ages = fillRndAges();

        int[] ageRanges = new int[150];
        for (int age : ages) {
            ageRanges[age]++;
        }

        System.out.println(Arrays.toString(ageRanges));

        // 2 3 4 5 67 8 4 3 2 4 5 56 6 7 77 6 5 4 4 3 3
        // {0, 0, 1, 1, 3, 0 ... 0}
    }

    private static int[] fillRndAges() {
        Random rnd = new Random();
        int[] ages = new int[10_000_000];

        for (int i = 0; i < 10_000_000; i++) {
            ages[i] = rnd.nextInt(150);
        }
        return ages;
    }
}
