package az.iktlab.group_j4.java_lessons.lesson_6;

import java.util.Arrays;

public class ArrayEx {

    public static void main(String[] args) {

        int[] arr = new int[5];
        // [0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr));

        arr[1] = 5;
        arr[3] = 8;
        // [0, 5, 0, 8, 0]
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {3, 5, 6, 8, 7, 9};
        System.out.println(Arrays.toString(arr1));

        StringBuilder frmt = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {

            if (i != arr.length - 1) {
                frmt.append(arr[i]).append(",");
            } else frmt.append(arr[i]).append("]");
        }

        System.out.println(frmt);
    }
}
