package sorted;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortedMain {
    public static void main(String[] args) {

        int[] arr = new int[]{8, 2, 3, 9, 6, 5, 2, 7, 4, 1};
        System.out.println("Изначальный массив" + Arrays.toString(arr));

        System.out.println("Отсортированный массив" + Arrays.toString(sorted(arr)));

    }

    static int[] sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int first;
                    first = arr[j];
                    arr[j] = arr[i];
                    arr[i] = first;
                }
            }
        }
        return arr;
    }

}
