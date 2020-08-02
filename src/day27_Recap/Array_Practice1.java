package day27_Recap;

import java.util.Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {


        String[] names = {"Alan", "Onur", "Jack", "Jeremy", "Linda", "Henry", "Ali", "William", "White"};

        for (int i = 0; i < names.length - 1; i++) {

            //  if (names[i].charAt(0) != 'A')  == > char method
            if (!names[i].startsWith("A")) {//  == > String method
                continue;


        }
        System.out.println(names[i]);
    }
        System.out.println("=============================================");

        float [] numbers = new float[5]; // you can not add more than 5 elements because elements size fixed.

        numbers[4] = 12.2f;
        System.out.println(numbers);

        System.out.println(Arrays.toString(numbers));


        System.out.println("==================================================");

    }
}