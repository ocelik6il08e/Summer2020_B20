package day32_MethodOverLoading;

import java.util.Scanner;

/*
write a return method that accepts two numbers and an operator, then returns calculation result.
             if the oerator is invalid, return zero
             otherwise return the result
 */
class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number :");
        double num1 = scan.nextDouble();
        System.out.println("Please chose a operator for calculation :");
        char opr = scan.next().charAt(0);
        System.out.println("Enter the second number :");
        double num2 = scan.nextDouble();

       double result =  calculator(num1,opr,num2);
        System.out.println("The result is: " + result);

    }

    public static double calculator(double num1, char opr, double num2){

        double result = (opr == '+')? num1 + num2 :(opr == '-')? num1 - num2
                :(opr =='*')? num1 * num2 :(opr == '/')? num1/num2 :(opr =='%')? num1%num2 : 0;
        return result;
    }
}
