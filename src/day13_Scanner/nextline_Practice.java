package day13_Scanner;

import java.util.Scanner;

public class nextline_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your bulding number : ");
        int buildingnumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter full street name");
        String streetName = scan.nextLine();

        System.out.println(buildingnumber + " "+ streetName);

         scan.close();
    }
}
