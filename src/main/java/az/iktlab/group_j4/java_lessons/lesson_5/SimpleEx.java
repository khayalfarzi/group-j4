package az.iktlab.group_j4.java_lessons.lesson_5;

import java.util.Scanner;

public class SimpleEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;

        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                cnt++;
        }

        if (cnt == 0)
            System.out.println("Sade");
        else System.out.println("Murekkeb");
    }
}
