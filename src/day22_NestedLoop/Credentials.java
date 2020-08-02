package day22_NestedLoop;

import java.util.Scanner;

public class Credentials {
    /*
   Valid username : cyber
   Valid Password : tek123
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = scan.next();
        System.out.println("Enter your password: ");
        String p = scan.next();
        int attempt = 0;
        while (!(u.equals("cyber") && p.equals("tek123"))){
            if(attempt > 2){
                System.out.println("Your account is locked");
                System.exit(0);
            }
            System.out.println("Invalid username or password, Please re-enter");
            System.out.println("Enter your username :");
            u = scan.next();
            System.out.println("Enter your password: ");
            p = scan.next();
            attempt++;

        }
        System.out.println("You logged in.");
    }
}
