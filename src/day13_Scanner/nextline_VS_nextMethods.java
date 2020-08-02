package day13_Scanner;

import java.util.Scanner;

public class nextline_VS_nextMethods {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your salary : ");
        double salary = scan.nextDouble();

        scan.nextLine();

        System.out.println("Please enter your full name : ");
        String fullName = scan.nextLine();


        System.out.println(fullName + "'s salary is " + salary + " USD.");

    }
}
