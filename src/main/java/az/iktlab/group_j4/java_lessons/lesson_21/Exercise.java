package az.iktlab.group_j4.java_lessons.lesson_21;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> clrs = Arrays.asList("Red", "Red", "Blue", "Orange", "White", "Black");
        System.out.print("Enter color: ");
        String clr = sc.nextLine();

        clrs.forEach(s -> {
            if (s.equalsIgnoreCase(clr))
                System.out.println("Found");
        });
    }
}