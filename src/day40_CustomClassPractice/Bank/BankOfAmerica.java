package day40_CustomClassPractice.Bank;

import day40_CustomClassPractice.Bank.BankAccount;

public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount david = new BankAccount();

        david.setAccountInfo("Saving", "David Wilson", "3685698654325");
        david.getAccountInfo();
        david.deposit(12365.66);
        david.checkBalance();
        david.deposit(3000);
        david.checkBalance();
        david.withdraw(125);
        david.checkBalance();
        david.withdraw(255);
        david.checkBalance();
        david.withdraw(500000);
        david.checkBalance();
        david.withdraw(14000);
        david.checkBalance();
    }
}
