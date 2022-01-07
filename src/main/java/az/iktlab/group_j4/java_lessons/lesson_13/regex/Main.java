package az.iktlab.group_j4.java_lessons.lesson_13.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");

        boolean isExist= matcher.find();

        System.out.println(isExist);

        String text = "Hello:Java:World";
        System.out.println(Arrays.toString(text.split(":")));
    }
}