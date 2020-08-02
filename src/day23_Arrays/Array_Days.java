package day23_Arrays;

import java.util.Scanner;

public class Array_Days {
    public static void main(String[] args) {



        String days[] = new String[7]; // [7] ==> Element size. It is not number of index.Don't confused.

        days[5] = "Saturday";
        days[1] = "Tuesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[2] = "Wednesday";
        days[6] = "Sunday";
        days[0] = "Monday";

        for (int i = 0; i <= days.length-1; i++) {
            System.out.print(days[i]+" ");

        }
        System.out.println();
        System.out.println("=============Scanner===============");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Please enter a number between 1 to 7");
        System.out.println(days[n-1]);

    }
}
