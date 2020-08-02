package day14_Recap;
import java.util.Scanner;

/*
task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */

public class Scanner_Methods_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Gender :");
        String gender = scan.next();


        System.out.println("Please Enter Your Age:");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Please Enter your Country Name: ");
        String countryName = scan.nextLine();

        System.out.println("Please Enter Your Zipcode: ");
        int zipcode = scan.nextInt();

        scan.nextLine();
        System.out.println("Please Enter Your Full Name: ");
        String fullName = scan.nextLine();

        System.out.println("Please Enter Your Company Name: ");
        String companyName = scan.nextLine();

        System.out.println("Personal Informations:\n");

        System.out.println("His gender: "+gender
                        + " \nHis Age: "+age
                        + "\nHis Country: "+countryName
                        + "\nHis zipcode: "+zipcode
                        + "\nHis full name: "+fullName
                        + "\nHis Company: "+companyName);


    }
}
