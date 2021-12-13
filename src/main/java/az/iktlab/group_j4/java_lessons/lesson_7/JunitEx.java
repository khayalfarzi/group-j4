package az.iktlab.group_j4.java_lessons.lesson_7;

public class JunitEx {

    public static void main(String[] args) {
        int max = findMax(3, 4, 5);
        int max1 = findMax(6, 7, 8);
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
//        return a > b ? (a > c ? c : a) : b;
    }

    public static int findMin(int a, int b) {
        if(a>=b){
            return a;
        }
        else {
            return b;
        }
    }
}
