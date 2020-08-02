package day03_sequences_Variables;

public class SalaryCalculator {
    /*
    Task: Salary : 100 000 anf Tax rate :0.28
    How much is net income?
     */

    public static void main(String[] args) {

        int salary = 100000;
        double taxRate = 0.28;
        double totalTax = salary*taxRate;
        double netIncome = salary - (totalTax);
        System.out.println("Net Income : " + netIncome);
        System.out.println("Total tax : "+ totalTax);
    }
}
