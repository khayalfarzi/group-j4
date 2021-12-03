package az.iktlab.group_j4.java_lessons.lesson_6;

import java.util.Arrays;

public class MultiDmnsArraysEx {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        arr[0][0] = 7;
        arr[0][2] = 98;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int[] arr2 = {1, 2, 4};
        int[][] arr1 =
                {{1, 2, 3},
                        {4, 6, 9},
                        {3, 5, 8, 10},
                        {},
                        arr2};

        int[][] arr3 = new int[2][];

        //...
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
}
