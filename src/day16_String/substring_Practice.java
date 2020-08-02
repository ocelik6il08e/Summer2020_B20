/*
. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
package day16_String;

import java.util.Scanner;

public class substring_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter firs word please: ");
        String word1 = scan.nextLine();
        System.out.println("Enter second word please: ");
        String word2 = scan.nextLine();

        System.out.println(""+word1.substring(1)+word2.substring(1));


    }

}
