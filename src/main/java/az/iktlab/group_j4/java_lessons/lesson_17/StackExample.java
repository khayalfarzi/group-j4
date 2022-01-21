package az.iktlab.group_j4.java_lessons.lesson_17;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {


        Stack<Integer> i = new Stack<>();
        boolean result = i.empty();
        System.out.printf("Is the Stack empty? %s \n", result );
        i.push(5);
        i.push(13);
        i.push(11);
        i.push(10);


        System.out.println(i);
        result = i.empty();
        System.out.println(result);

    }
}
