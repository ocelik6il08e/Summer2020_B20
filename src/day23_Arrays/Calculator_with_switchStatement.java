package day23_Arrays;

import java.util.Scanner;

public class Calculator_with_switchStatement {
        public static void main(String[] args) {
            while(true) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter two numbers: ");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();

                System.out.println("Enter the math operator:");
                char oprt = scan.next().charAt(0);

                switch (oprt){
                    case '+':
                        System.out.println(num1 + num2);
                        break;
                    case '-':
                        System.out.println(num1 - num2);
                        break;
                    case '*':
                        System.out.println(num1 * num2);
                        break;
                    case '/':
                        System.out.println(num1 / num2);
                        break;
                    case '%':
                        System.out.println(num1%num2);
                        break;
                    default:
                        System.out.println("Invalid Operator");
                }


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

