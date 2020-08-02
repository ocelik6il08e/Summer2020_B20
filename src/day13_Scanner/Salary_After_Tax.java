package day13_Scanner;

import java.util.Scanner;

/*
write a program that can calculate the state tax, federal tax and salary after tax
                needed informations:
                                annual salaray
                                state tax rate
                                federal tax rate
                MUST use Scanner

 */
public class Salary_After_Tax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Please enter your annual sallary : ");
        double salary = scan.nextDouble();

        System.out.println("Please enter Federal Tax Rate : ");
        double fedTaxRate = scan.nextDouble();
        double totalFedTax = salary * fedTaxRate;

        System.out.println("Please enter State Tax Rate : ");
        double stateTaxRate = scan.nextDouble();
        double totalStateTax = salary * stateTaxRate;
        double netIncome = salary - totalFedTax - totalStateTax;
        double totalTaxPay = totalFedTax + totalStateTax;

        System.out.println("Your Gross income - Before Tax : "+salary);
        System.out.println("You will pay tax for the Federal : "+ totalFedTax);
        System.out.println("You will pay tax for the State : "+totalStateTax);
        System.out.println("Total tax is: "+ totalTaxPay);
        System.out.println("Your net income - After Tax : "+ netIncome);










    }

}
