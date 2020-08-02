package day021_Loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
/*
 1. write a program that asks user to enter 5 numbers and retuns the maximum number
 */
    Scanner scan = new Scanner(System.in);
    int max = -236498756;

    for(int i =10; i <= 50; i +=10) {
        System.out.println("Enter e number:");
        int num = scan.nextInt();

        if (num > max) {
            max = num;
        }
    }
        System.out.println("Max number is "+max);
}

}