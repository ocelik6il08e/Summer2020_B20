package day23_Arrays;

import java.util.Scanner;

/*
  1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers.
   then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is not a valid answer (not yes or no), the the program should repeatedly
                    ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

 */
public class Addition {
    public static void main(String[] args) {
        while(true) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter two numbers: ");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int result = num1 + num2;
            System.out.println(result);
            System.out.println("Do you want to continue?");
            String a = scan.next().toLowerCase();

            while( !(a.equals("yes") || a.equals("no"))) { // => while has invalid answer this condition will be repeat.
                // we changed if => to while
                // (iyi bir ornek if ile while arasindaki farki gormek icin)
                System.out.println("Invalid Answer, please enter yer or no");
                System.out.println("Do you want to continue?");
                a = scan.next().toLowerCase();
            }
                if (a.equals("no")) {
                    break;
                }
            }
        System.out.println("Thank you for using the calculator!");
        System.exit(0);
        }
    }
