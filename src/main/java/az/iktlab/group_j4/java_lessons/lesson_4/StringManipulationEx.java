package az.iktlab.group_j4.java_lessons.lesson_4;

import java.util.Scanner;

public class StringManipulationEx {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.next();

        String lastIndex = String.valueOf(word.charAt(word.length() - 1));

        word = String.format("%s%s%s", lastIndex, word, lastIndex);
        System.out.println(word);

    }
}
