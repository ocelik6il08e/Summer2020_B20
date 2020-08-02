package day23_Arrays;

import java.util.Scanner;

public class Array_Months {
    public static void main(String[] args) {
        String[] months = {"January","February","Marh","April","May","June","July","August","September","October","November","December"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 12");
        int m = scan.nextInt();
        System.out.println(months[m-1]);
    }
}
