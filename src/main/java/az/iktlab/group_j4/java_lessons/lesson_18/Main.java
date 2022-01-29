package az.iktlab.group_j4.java_lessons.lesson_18;

public class Main {

    public static void main(String[] args) {
        AlgorithmChecker checker = new AlgorithmChecker();

//        int[] smallArr = RandomArrGenerator.generateRndArr(10, "small.csv");
//        long consumingS = checker.checkSortMethod(smallArr);
//        System.out.println("Consuming for small: " + consumingS);
//
//        int[] mediumArr = RandomArrGenerator.generateRndArr(100, "medium.csv");
//        long consumingM = checker.checkSortMethod(mediumArr);
//        System.out.println("Consuming for medium: " + consumingM);

        int[] bigSavedArr = RandomArrGenerator.generateRndArr(10_000_000, "big.csv");
        long consumingB = checker.checkSortMethod(bigSavedArr);
        System.out.println("Consuming for big: " + consumingB);

//        int[] extremelyArr = RandomArrGenerator.generateRndArrr();
//        long consumingEx = checker.checkSortMethod(extremelyArr);
//        System.out.println("Consuming for extremely: " + consumingEx);
    }
}
