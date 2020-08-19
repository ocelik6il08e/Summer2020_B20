package day40_CustomClassPractice.Bank;

import java.text.DecimalFormat;

/*
 create a custom class for BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance
          Actions: showBalance, deposit, withdraw

          requirements:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance

 */
public class BankAccount {

DecimalFormat df = new DecimalFormat("0.00");
    String accountType;
    String accountHolder;
    String accountNumber;
    double accountBalance;


    public void setAccountInfo(String clientAccountType, String name, String acctNo) {

        accountType = clientAccountType;
        accountHolder = name;
        accountNumber = acctNo;


    }
    public void getAccountInfo(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Account Holder Name: "+accountHolder);
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Available Balance :"+df.format(accountBalance));
        System.out.println("---------------------------------------------------------");
    }

    public void checkBalance() {
        System.out.println("Available Balance :"+df.format(accountBalance));
    }

    public void deposit(double amount) {
        System.out.println("Depositing $"+df.format(amount)+" to "+accountNumber);
        accountBalance += amount;

    }

    public void withdraw(double amount) {
        if(amount > accountBalance) {
            System.out.println("You don't have Enough $"+df.format(amount)+" on your Balance." +
                    "Thank you for using day40_CustomClassPractice.Bank Of America.");
            return;
        }else{
            accountBalance -= amount;
            System.out.println("Withdrawing $" + df.format(amount) + " from " + accountNumber);
        }
    }
}
