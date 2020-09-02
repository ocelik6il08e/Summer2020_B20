package Office_Hours.Office_Hours._08_24_20;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Recap {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i <= names.length-1 ; i++) {
            System.out.println("Enter a name : ");
            names[i] = scan.nextLine();
        }



        System.out.println(Arrays.toString(names));
    }
}
