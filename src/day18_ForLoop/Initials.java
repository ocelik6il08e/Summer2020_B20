package day18_ForLoop;
/*

1. write a program that asks user's first and last name, then prints out the initials of the user

                input:

                    cybertek

                    batch18



                output:

                    your initial is: CB



        DO NOT use charAt method

 */
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fName = scan.next();
        String lName = scan.next();
        String initials1 = fName.substring(0,1)+"."+lName.substring(0,1);
        initials1 = initials1.toUpperCase();
        System.out.println(initials1);

        System.out.println("==========================================");

        char ch1 = fName.charAt(0);
        char ch2 = lName.charAt(0);
        String initials2 = ""+ch1+"."+ch2;
        initials2 = initials2.toUpperCase();
        System.out.println(initials2);
    }
}
