package az.iktlab.group_j4.java_lessons.lesson_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {
    public static void main(String[] args) {


        ArrayList<String> colors = new ArrayList<String>();
        String result = null;
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        List<String> result1 = new ArrayList<>();
        colors.forEach(obj -> {
            if (obj.equals("Black")) {
                System.out.println("Black");
            }
    });
}
}