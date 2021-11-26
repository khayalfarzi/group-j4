package az.iktlab.group_j4.java_lessons.lesson_4;

public class StringEx {

    public static void main(String[] args) {

        String num1 = "5";
        String num2 = "8";

        System.out.println("8");
        System.out.println(num1 + num2);

        int a = 5;
        int b = 8;
        System.out.println(a + b);

        int num3 = 123;
        String num4 = String.valueOf(num3);

        StringBuilder sb = new StringBuilder("BB");
        sb.append(" CC");

        System.out.println(sb); // BB CC

        sb.reverse();

        System.out.println(sb); // CC BB
    }
}
