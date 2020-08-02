package day15_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // write a program that tasks theuser's enter first name and last
        // print the initial of the person's name

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        char fN = firstName.charAt(0);


        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        char lN = lastName.charAt(0);

        System.out.println("Your initial is: "+fN+"." +lN);
        System.out.println(fN + lN);
    }
}
