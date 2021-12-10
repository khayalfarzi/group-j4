package az.iktlab.group_j4.java_lessons.lesson_8.warmup;

public class FactorialEx {

    public static int calcFactorial(int num) {
        int ret=1;
        for (int i = num; i >=1 ; i--) {
            ret*=i;
        }
        return ret;
    }
}
