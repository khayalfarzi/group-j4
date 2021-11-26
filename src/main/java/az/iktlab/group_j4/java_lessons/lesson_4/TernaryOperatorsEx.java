package az.iktlab.group_j4.java_lessons.lesson_4;

public class TernaryOperatorsEx {

    public static void main(String[] args) {

        int num = 5;
        int a = 0;

        if (num >= 3)
            a = 1;
        else a = 2;
        System.out.println(a);

        int b = num >= 3 ? 1 : 2;
        System.out.println(b);
    }
}
