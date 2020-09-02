package day48_Inheritance;

public class BankObject {
    public static void main(String[] args) {


    BankAccount member1 = new BankAccount("Onur","Ceyhan");
    member1.setAccountHolder(member1.firstName +" " + member1.lastName);
    member1.setAccountNumber(3653862);
    member1.setBalance(250);

    member1.availableBalance();
    member1.deposit(500);
    member1.availableBalance();

    member1.withdraw(175);
    member1.withdraw(80);
    member1.withdraw(210);
    member1.withdraw(65);
    member1.withdraw(60);

        System.out.println(member1);


    }
}
