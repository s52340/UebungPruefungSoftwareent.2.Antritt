package MehrdimensionaleArrays;

import java.util.Arrays;

public class MehrdimensionaleArraays {
    public static void main(String[] args) {

        int[] arr = new int[4];
        arr[0] = 1;
        // int[] arr2 = {1,2,3,4};

        int[][] mehrDim = new int[3][3];
        mehrDim[0][0] = 1;
        mehrDim[0][1] = 2;
        mehrDim[0][2] = 3;
        mehrDim[1][0] = 4;
        mehrDim[1][1] = 5;
        mehrDim[1][2] = 6;
        mehrDim[2][0] = 7;
        mehrDim[2][1] = 8;
        mehrDim[2][2] = 9;

        System.out.println(Arrays.deepToString(mehrDim));
        for (int[] x :
                mehrDim) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();

        int[][] dimdim = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int[] x :
                dimdim) {
            System.out.println(Arrays.toString(x));
        }

    }


    }



