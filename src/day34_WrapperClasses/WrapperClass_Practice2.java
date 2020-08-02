package day34_WrapperClasses;

import java.util.Scanner;

public class WrapperClass_Practice2 {

    public static void main(String[] args) {

        int a =  Integer.MAX_VALUE;
        System.out.println(a);
        int a1 = Integer.MIN_VALUE;
        System.out.println(a1);
        System.out.println("-----------------------------");
        byte b= Byte.MAX_VALUE;
        System.out.println(b);
        byte b1 = Byte.MIN_VALUE;
        System.out.println(b1);

        System.out.println("------------------------------");
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter a number :");
            int n = scan.nextInt();
            if(n > max){
                max = n;
            }
            if(n < min){
                min = n;
            }

        }
        System.out.println("Maximum number is:"+ max);
        System.out.println("Mimimum number is" + min);
    }
}
