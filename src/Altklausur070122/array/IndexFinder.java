package Altklausur070122.array;

import java.util.Arrays;

public class IndexFinder {
//Altklausur
    public static void main(String[] args) {

        int[] arr = {0,1,9,7};

        int indexNumber = findIndexForNumber(arr, 9);
        System.out.println("indexNumber = " + indexNumber);

        int[] incides = findIndicesForExpectedSum(arr, 8);
        System.out.println("incides = " + Arrays.toString(incides));
    }

    public static int findIndexForNumber(int[] numbers, int searchNumber){

        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber){
                index = i;
                break;
            }
            else {
                index = -1;
            }
        }
        return index;
    }

    // 0 1 2 3 4 5 // 6
    public static int[] findIndicesForExpectedSum(int[] numbers, int expectedSum){
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - 1; j++) {
                if (numbers[i] + numbers[j] == expectedSum){
                    result[0] = j;
                    result[1] = i;
                    break;
                }
                else {
                    result[0] = -1;
                    result[1] = -1;
                }
            }
        }
        return result;
    }

}
