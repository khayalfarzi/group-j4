package az.iktlab.group_j4.java_lessons.lesson_22;

public class ArithmeticExceptionExample {

    public static void main(String[] args) throws ArithmeticException {

        int e = 5 / 1;
        System.out.println(e);

        try {
            System.out.println(div(0));
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }

//        try {
//            System.out.println("Try block");
//
//            int elem = 5 / 1;
//
//            System.out.println(elem); //5
//
//        } catch (ArithmeticException e) {
////            System.out.println(e.getMessage());
//            System.out.println("Xeta bash verdi");
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Finally block");
//        }
    }

    public static int div(int num) {
        if (num != 0) {
            return 5 / num;
        } else
            throw new RuntimeException("Xeta: Div by 0");
    }
}