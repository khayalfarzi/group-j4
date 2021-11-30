package az.iktlab.group_j4.java_lessons.lesson_5;

import java.util.Scanner;

public class SwitchEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        switch (day) {
            case "M":
                System.out.println("MNDY");
            case "TH":
                System.out.println("THRSDY");
            case "W":
                System.out.println("WDNSDY");
//                break;
            default:
                System.out.println("Not Found");
        }
    }
}
