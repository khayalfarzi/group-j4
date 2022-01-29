package az.iktlab.group_j4.java_lessons.lesson_18;

public class AlgorithmChecker {

    int count = 0;

    public long checkSortMethod(int[] arr) {

        Long start = System.nanoTime();

        // Elshan                           Elshad      Nigar and Rashad         Nicat          Emin

        // small -      120301              131500          100100                94700         82300
        // medium -     1185000             210800          238200                165900        290000
        // big -        1810889999          -               2658136900            1304356100
        // extremely -  24787220999         -               31481065900           13780439900
//        quicksort(arr, 0, arr.length - 1);
//        selectArray(arr);
//        mergeSort(arr, 0, arr.length - 1);
        sortArray(arr);
//        radix(arr);
        Long end = System.nanoTime();
        return end - start;
    }

    public void sortArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Nicat - radix
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static void countingSort(int a[], int place) {
        int[] output = new int[a.length];
        int[] count = new int[10];
        for (int i = 0; i < a.length; i++) {
            count[(a[i] / place) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = a.length - 1; i >= 0; i--) {
            output[count[(a[i] / place) % 10] - 1] = a[i];
            count[(a[i] / place) % 10]--;
        }

        for (int j = 0; j < a.length; j++) {
            a[j] = output[j];
        }
    }

    public void radix(int[] a) {
        int max = findMax(a);
        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(a, place);
        }
    }

    // Nigar and Rashad - merge sort
    void merge(int[] arr, int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] M = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = arr[q + 1 + j];


        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    void mergeSort(int[] arr, int l, int r) {
        if (l < r) {

            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    // Elshad insertion sort
    void selectArray(int[] array) {
        int a = array.length;
        for (int i = 1; i < a; i++) {
            int b = array[i];
            int k = i - 1;
            while (k >= 0 && array[k] > b) {
                array[k + 1] = array[k];
                k = k - 1;
            }
            array[k + 1] = b;
        }
    }

    // Elshan quick sort
    static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);

    }

    static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quicksort(array, low, pi - 1);
            quicksort(array, pi + 1, high);
        }
    }
}