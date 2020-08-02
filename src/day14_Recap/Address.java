package day14_Recap;
import java.util.Scanner;

public class Address {

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Please Enter your bulding Number:");
        int buildingN = var.nextInt();

        var.nextLine();
        System.out.println("Please Enter your Street Name:");
        String street = var.nextLine();

        System.out.println("Please Enter your City Name:");
        String cityName = var.nextLine();

        System.out.println("Please Enter your State Name:");
        String stateName = var.next();

        System.out.println("Please Enter your Zipcode:");
        int zipcode = var.nextInt();

        var.nextLine();
        System.out.println("Please Enter your Full Name:");
        String fullName = var.nextLine();
        var.close();

        System.out.println("Personal Informations :"
        +"\nBulding Number: "+buildingN
        +"\nStreet Name : "+street
        +"\nCtiy Name: "+cityName
        +"\nState Name: "+stateName
        +"\nZipcode : "+zipcode
        +"\nFull Name: "+fullName);
    }
}
