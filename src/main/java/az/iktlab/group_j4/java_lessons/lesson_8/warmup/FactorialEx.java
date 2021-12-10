package az.iktlab.group_j4.java_lessons.lesson_8.warmup;

import java.util.Scanner;

public class FactorialEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(calcFactorial(n));


    }



    public static int calcFactorial(int num) {
        if(num==0){
            return 1;
        }else{
            return num * calcFactorial(num-1);
        }




    }
}
