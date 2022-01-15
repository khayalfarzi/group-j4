package az.iktlab.group_j4.java_lessons.lesson_15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {

    public static void main(String[] args) {

        LocalDate date = LocalDate.MIN;
        LocalDate date1 = LocalDate.MAX;
        LocalDate date2 = LocalDate.now();
        LocalDate date3 = LocalDate.of(2021, 1, 14);

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MMM/dd");
        String date4 = LocalDate.now().format(formatter);
        System.out.println(date4);
    }
}
