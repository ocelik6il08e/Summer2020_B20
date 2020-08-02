package day13_Scanner;

import java.util.Scanner;

public class next_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = scan.next();
        scan.next();
        System.out.println("Enter Last Name : ");
        String lastName = scan.next();

        String fullName = firstName +" "+ lastName;
        System.out.println("Full name is "+fullName);
    }
}
