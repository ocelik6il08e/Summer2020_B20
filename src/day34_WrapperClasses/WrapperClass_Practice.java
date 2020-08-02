package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass_Practice {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};

        for (int each : arr2) {

            System.out.println(each);
        }

        double[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        Double[] arr4 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0};

        for(Double each : arr4){
            System.out.println(each);
        }

        char[] arr5 = {65,67,68,69};
        System.out.println(Arrays.toString(arr5 ));

        char ch = 79;
        Character ch2 = 79;

        System.out.println(ch2);


    }
}
