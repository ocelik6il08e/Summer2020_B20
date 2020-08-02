package day32_MethodOverLoading;

import java.util.Scanner;

/*
 write a method that can retunr the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
 */
public class Format_FullName {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name please :");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name please :");
        String lastName = scan.nextLine();

        String fullName = formatFullName(firstName,lastName);
        System.out.println(fullName);
/*
        firstName = firstName.toUpperCase().substring(0, 1) + firstName.toLowerCase().substring(1);
        lastName = lastName.toUpperCase().substring(0, 1) + lastName.toLowerCase().substring(1);
        String fullName = firstName +" "+lastName;
        System.out.println(fullName);

 */
    }

    public static String formatFullName(String firstName, String lastName){

        firstName = firstName.toUpperCase().substring(0, 1) + firstName.toLowerCase().substring(1);
        lastName = lastName.toUpperCase().substring(0, 1) + lastName.toLowerCase().substring(1);
        String fullName = firstName +" "+lastName;

        return fullName;
    }
}
