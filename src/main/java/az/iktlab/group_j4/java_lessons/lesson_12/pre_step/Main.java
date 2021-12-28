package az.iktlab.group_j4.java_lessons.lesson_12.pre_step;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10_000_000; i++) {
            new Human();
        }

        System.gc();
    }
}
