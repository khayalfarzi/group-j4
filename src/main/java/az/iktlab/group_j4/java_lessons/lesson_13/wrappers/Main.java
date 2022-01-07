package az.iktlab.group_j4.java_lessons.lesson_13.wrappers;

public class Main {

    public static void main(String[] args) {

        String num = "123";

//        int numInt = (int) num;
        Integer numInteger = Integer.parseInt(num);
        System.out.println(numInteger);

        Integer integer = 234;
        System.out.println(Integer.rotateRight(2, 9));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer integer1 = new Integer(512);

        // Boxing/ Auto boxing
        int a = 34;
        Integer b = a;

        // Unboxing
        Integer c = 56;
        int d = c;
    }
}