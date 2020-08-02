package day29_CustomMethods;

import java.util.Scanner;

public class Methods_WithParameters {


    public static void main(String[] args) {
        printHello(10);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter birth and current years :");
        int currentYear = scan.nextInt();
        int birthYear = scan.nextInt();


        age(currentYear, birthYear); // or age(scan.nextInt, scan.nextInt);
    }

    public static void printHello(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Hello world");
        }

    }
    public static void age(int currentYear,int birthYear){

        int age = currentYear - birthYear;
        System.out.println("You are "+ age +" years old.");
    }
}
