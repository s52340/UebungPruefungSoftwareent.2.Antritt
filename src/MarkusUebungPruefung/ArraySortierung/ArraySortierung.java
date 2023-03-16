package MarkusUebungPruefung.ArraySortierung;

import java.util.Arrays;

public class ArraySortierung {
    public static void main(String[] args) {

        // { 5, 2, 22, 4, 3, 11, 1)

        int[] array = {5, 2, 11, 22, 4, 3, 1};
        sort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 2; j++)
                if (arr[j+1] > 10 && arr[j] > arr[j +2]) {
                    int save = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = save;
                    j++;
                }
                else if (arr[j] < 10 && arr[j] > arr[j+1]){
                    int save = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = save;
                }


        }
    }


}
