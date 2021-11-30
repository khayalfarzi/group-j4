package az.iktlab.group_j4.java_lessons.lesson_5;

public class LoopEx {

    public static void main(String[] args) {

        OUTTER:
        for (int i = 0; i < 5; i++) {
            INNER:
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    System.out.println(j);
                    break INNER;
                }
            }
        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            for (int j = 0; j < 5; j++) {
//                System.out.println(i * j);
//            }
//        }
    }
}
