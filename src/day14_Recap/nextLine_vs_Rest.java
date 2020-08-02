package day14_Recap;

import java.util.Scanner;

public class nextLine_vs_Rest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age please : ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name please : ");
        String fullName = input.nextLine();

        System.out.println(fullName+ " is "+age+" years old.");

    }
}
