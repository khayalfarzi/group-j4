package az.iktlab.group_j4.java_lessons.lesson_6.warmup;

import java.util.Random;
import java.util.Scanner;

public class AgeManipulationEx {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] ages = fillRndAges();

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
