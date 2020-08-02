package day06_ComparisonOperators;

import java.sql.SQLOutput;

// Task :  write a program that can calculate the tax, and salary after tax based on the hourly rate & tax rates
public class TaxCalculator {

    public static void main(String[] args) {

        double hourlyRate = 55;
        double weeklyHours = 40;
        double fedTaxRate = 0.04;
        double stateTaxRate = 0.22;
        double salary = hourlyRate * weeklyHours * 48;
        double totalTax = fedTaxRate + stateTaxRate;

        System.out.println("Your yearly income is: "+salary);
        System.out.println("Total income tax is: "+salary * totalTax);
        System.out.println("Your income after tax is: "+ ((salary) - (salary * totalTax)));




    }
}
