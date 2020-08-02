package day16_String;
/*
1. Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        NOTE: you will need nested If

 */
import java.util.Scanner;

public class Tak1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = scan.nextLine();
        System.out.println("Enter second word:");
        String word2 = scan.nextLine();


//        System.out.println(sentence);

        if(word1.length() >= 5 && word2.length() >= 5){
            if(word1.charAt(word1.length()-1) == word2.charAt(0)){
                System.out.println("Fizzy");
            }else{
                System.out.println("Buzz - did not match");
            }
        }else{
            System.out.println("You need to be exactly 5 chars length");
        }



    }
}
