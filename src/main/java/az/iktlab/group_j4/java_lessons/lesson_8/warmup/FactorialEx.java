package az.iktlab.group_j4.java_lessons.lesson_8.warmup;

public class FactorialEx {

    public static int calcFactorial(int num) {
        if(num == 1){
            return 1;
        }
        else{
            return num * calcFactorial(num - 1);
        }
    }
}
