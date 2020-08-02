/*
 2. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true

 */
package day16_String;

import java.util.Scanner;

public class FristAndLastCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word please :");

        String word = scan.next();
        char fristChar = word.charAt(0);
        char lastChar = word.charAt(word.length() -1);

        System.out.println(fristChar == lastChar);

        System.out.println(""+fristChar+lastChar);



    }
}
