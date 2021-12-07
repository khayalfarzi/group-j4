package az.iktlab.group_j4.java_lessons.lesson_7;

public class MethodExample {

    public static void main(String[] args) {

        method1(); //Method 1

        int m2 = method2();
        System.out.println(m2); // 12

        method3(23); // 23
        method3(method2()); // 12

        int m4 = method4(2, 5);
        System.out.println(m4); // 14
    }

    public static void method1() {
        System.out.println("Method 1");
    }

    public static int method2() {
        method3(12);
        return 12;
    }

    public static void method3(int apple) {
        System.out.println(apple);
    }

    public static int method4(int a, int b) {
        int returnNumber = a * 2 + b * 2;
        return returnNumber;
    }
}
