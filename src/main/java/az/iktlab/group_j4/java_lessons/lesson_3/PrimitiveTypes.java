package az.iktlab.group_j4.java_lessons.lesson_3;

/*
 *  - boolean
 *  - byte
 *  - short
 *  - char
 *  - int
 *  - float
 *  - double
 *  - long
 * */
public class PrimitiveTypes {

    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 9;

//        num1 = num2 - num1; // 3
//        num2 = num2 - num1; // 6
//        num1 = num1 + num2; // 9

        num1 = num2 + num1; // 15
        num2 = num1 - num2; // 6
        num1 = num1 - num2; // 9

        System.out.println(num1); // 9
        System.out.println(num2); // 6

        boolean b = true;
        byte bt = 100;
        short sh = 657;
        char ch = 'A';
        int i = 5;
        float ft = 5.6f;
        double d = 6.7d;
        long l = 98L;

        /*
         * int a = 6;
         * int b = 8;
         * int c = a +b; 14
         *
         * long qa = 7;
         * long b = 8 ;
         * long c = a+b; 15
         *
         * byte a = 7;
         * byte b = 8;
         * byte c = a +b; 15
         *
         * */
    }
}
