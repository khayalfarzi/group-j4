package az.iktlab.group_j4.java_lessons.lesson_8.warmup;

public class FactorialEx {

    public static int calcFactorial(int num) {
        return num == 1 ? 1 : calcFactorial(num - 1) * num;
    }
}
