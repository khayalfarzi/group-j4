package az.iktlab.group_j4.java_lessons.lesson_15;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time1 = LocalTime.MIN;

        System.out.println(time1);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH-mm-ss");
        String time2 = LocalTime.now().format(formatter);

        System.out.println(time2);
    }
}
