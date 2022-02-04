package az.iktlab.group_j4.java_lessons.lesson_21;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinArrays {

    public static void main(String[] args) {

        List<String> clrs = Arrays.asList("Red", "Green", "Blue", "Orange", "White", "Black");
        List<String> newClrs = new ArrayList<>();
        newClrs.add("Red");
        newClrs.add("Green");
        newClrs.add("Blue");
        newClrs.add("Orange");

        newClrs.addAll(clrs);

        System.out.println(newClrs);
    }
}
