package az.iktlab.group_j4.java_lessons.lesson_15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

    public static void main(String[] args) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yy/MMM/dd & HH-mm-ss");
        String dateTime = LocalDateTime.now().format(formatter);

        System.out.println(dateTime);
    }
}
