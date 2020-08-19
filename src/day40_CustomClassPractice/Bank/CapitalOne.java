package day40_CustomClassPractice.Bank;

import day40_CustomClassPractice.Bank.BankAccount;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount onur = new BankAccount();
        BankAccount vildan = new BankAccount();
        BankAccount canan = new BankAccount();
        BankAccount deniz = new BankAccount();
        BankAccount hurmuz = new BankAccount();


        onur.setAccountInfo("Saving", "Onur Ceyhan", "NJ0233165656565");
        canan.setAccountInfo("Checking", "Canan Ceyhan", "NJ0233165653654");
        vildan.setAccountInfo("Saving", "Vildan Ceyhan", "NJ0233165656321");
        deniz.setAccountInfo("Checking", "Deniz Ceyhan", "NJ0233165658963");
        hurmuz.setAccountInfo("Saving", "Hurmuz Ceyhan", "NJ0233165651172");


        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(onur,canan,deniz,vildan,hurmuz));
//                                     0     1     2     3      4
        for(BankAccount each : accounts){

            each.getAccountInfo();
            each.deposit(100);

        }

        accounts.get(3).checkBalance();
        accounts.get(3).deposit(48500);
        accounts.get(3).withdraw(12000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(1100);
        accounts.get(4).withdraw(50000);
        accounts.get(4).checkBalance();
    }
}
