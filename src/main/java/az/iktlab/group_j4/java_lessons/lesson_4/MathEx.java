package az.iktlab.group_j4.java_lessons.lesson_4;

public class MathEx {

    public static void main(String[] args) {
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(4, 3));
        System.out.println(Math.asin(0.5));
        System.out.println(Math.random() * 100);

        int rnd = (int) (Math.random() * 100) + 40;

       int rnd1= (int) ((Math.random() * (60)) + 40);
        System.out.println(rnd);

        System.out.println(rnd1);
    }
}
