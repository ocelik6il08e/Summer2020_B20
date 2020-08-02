package day28_Recap;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        int[] arr1D = {1, 2, 3};

        int[][] arr2D = {{1, 2, 3, 4, 5, 6},{30,60,90,120,150},{2,3,6,9,10}};

        for (int i = 0; i <= arr2D.length-1 ; i++) {
            int [] each1DArray = arr2D[i];
           // System.out.println(Arrays.toString(each1DArray));

            for (int j = 0; j <= each1DArray.length-1; j++) {
                int eachNum = each1DArray[j];
                if(eachNum %2 == 0) {
                    System.out.print(eachNum + " ");
                }
            }
            System.out.println();
        }





    }
}
