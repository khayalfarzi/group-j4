package az.iktlab.group_j4.java_lessons.lesson_5;

import java.util.Scanner;

public class IfElseEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Musbet");
            System.out.println("Musbettt");
        } else if (num < 0)
            System.out.println("Menfi");
        else System.out.println("o");
    }
}
