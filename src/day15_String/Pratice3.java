package day15_String;

import java.util.Scanner;

public class Pratice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name please:");
        String fN = scan.nextLine();
        System.out.println("Enter your last name please:");
        String lN = scan.nextLine();

      String fullName1 = fN +" "+ lN;
        System.out.println("Your Full Name is: "+fullName1);
        System.out.println("=============================================\n");
        String fullName2 = fN.concat(" " .concat(lN));
        System.out.println("Your full name is: "+fullName2);
    }
}
