package az.iktlab.group_j4.java_lessons.lesson_14;

import java.text.Collator;
import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticSorting {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        String[] arr = word.split(" ");
        StringBuilder newWord = new StringBuilder();

        for (String s : arr)
            newWord.append(sortString2(s)).append(" ");

        System.out.printf("Output: %s", newWord.toString().trim());
    }

    public static String sortString(String inputString) {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static String sortString2(String str) {
        Collator collator = Collator.getInstance();
        String[] split = str.split("");
        Arrays.sort(split, collator);
        StringBuilder sorted = new StringBuilder();
        for (String s : split) {
            sorted.append(s);
        }
        return sorted.toString();
    }
}