package Office_Hours.Office_Hours.Office_Hours_07_01_2020;

import java.util.Scanner;

public class CombineTwoStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

        char ch1 = str1.charAt(str1.length() - 1);
        char ch2 = str2.charAt(0);

        if (ch1 == ch2) {
            System.out.println(str1+ str1.substring(1));
        } else {
            System.out.println(str1+str2);
        }
    }
}
