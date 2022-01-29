package az.iktlab.group_j4.java_lessons.lesson_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class RandomArrGenerator {

    private static final Random rnd = new Random();

    public static int[] generateRndArr(int length, String fileS) {
        System.out.println("Rnd start");
        File file = new File("C:\\Users\\Khayal Farziyev\\IdeaProjects\\group-juniors\\src\\main\\java\\az\\iktlab\\juniors\\java_lessons\\lesson_17/" + fileS);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[] bigSavedArr = new int[length];
        int index = 0;
        while (true) {
            assert scanner != null;
            if (!scanner.hasNext()) break;
            bigSavedArr[index++] = scanner.nextInt();
        }
        System.out.println("Rnd end");
        return bigSavedArr;
    }

    public static int[] generateRndArrr() {
        int[] arr = new int[100_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1_000_000);
        }
        return arr;
    }
}
