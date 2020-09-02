package day0;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 25, 0, -15, 56, 99, 12, 78};
        int[] arr2 = {22, 33, -6, -35, 11, 789, 53, 21, 66, -475, -23, 21, 0, 7, 3, 0, 9, 0, 4, 999};
        String word = "aaaambbbbbzcccc";
        String[] words = {"A", "B", "C", "A", "B", "Z"};
        String[] arr = {"ONUR", "VILDAN", "ONUR", "DENIZ", "ONUR","ALI","TURKISH RESTAURANT"};

        palindrome("Onur");
        System.out.println("============================");
        palindrome("KaYak");
        System.out.println("============================");
        schoolName();
        System.out.println("============================");
        maxNumber(arr1);
        System.out.println("============================");
        minNumber(arr1);
        System.out.println("============================");
        uniqueElement(words);
        System.out.println("============================");
        uniqueElement(arr);
        System.out.println("============================");
        reverse("SelamunAleykum");
        System.out.println("============================");
        reverseArrays(words);
        System.out.println("============================");
        reverseArrays(arr);
        System.out.println("============================");
        System.out.println("Descending Order : ");
        descending(arr1);
        System.out.println("============================");
        combine2Arrays(arr1, arr2);
        System.out.println("============================");
        maxAndMin(125, 55);
        System.out.println("============================");
        checkOfElements(arr2);
        System.out.println("============================");
        grade(101);
        System.out.println("Task Completed");
        System.out.println("============================");
        removeDuplicate(word);
        System.out.println("============================");
        oddNumbers();
        System.out.println();
        System.out.println("============================");
        evenNumbers();
        System.out.println();
        System.out.println("============================");
        shortestWord(arr);
        System.out.println("============================");
        longestWord(arr);
        System.out.println("============================");
        print3Letters(arr);
        System.out.println("============================");
        uniqueCharacters1(word);
        System.out.println("============================");
        uniqueCharacters2(word);
        System.out.println("============================");
        findToUniqueWord(arr);
        System.out.println("============================");
        occurrencesOfChar('a',word);
    }

    public static void palindrome(String names) {
        String reserved = "";
        for (int i = names.length() - 1; i >= 0; i--) {
            reserved += names.charAt(i);

        }
        System.out.println("Palindrome : " + reserved.equalsIgnoreCase(names));

    }

    public static void schoolName() {

        System.out.println("Cybertek School");
    }

    public static void maxNumber(int[] arr) {

        int max = arr[0];

        for (int each : arr) {

            if (each > max) {
                max = each;
            }
        }
        System.out.println("Maximum number is : " + max);
    }

    public static void minNumber(int[] arr) {

        int min = arr[0];

        for (int each : arr) {

            if (each < min) {
                min = each;
            }
        }
        System.out.println("Minimum number is : " + min);
    }

    public static void maxAndMin(int num1, int num2) {

        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println("Maximum number of int numbers : " + num1);
                System.out.println("Minimum number of int numbers : " + num2);
            } else {
                System.out.println("Maximum number of int numbers : " + num2);
                System.out.println("Minimum number of int numbers : " + num1);
            }
        } else {
            System.out.println(num1 + " and " + num2 + " are equal numbers.");
            return;
        }
    }

    public static void uniqueElement(String[] arr) {

        for (String each : arr) {
            int count = 0;
            for (String each2 : arr) {

                if (each.contains(each2)) {
                    count += 1;

                }
            }
            if (count == 1) {
                System.out.println("Unique Elements : " + each);
            }


        }


    }

    public static void reverse(String str) {

        String result = "".toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {

            result += str.charAt(i);
        }
        System.out.println("Reversed of String : " + result);

    }

    public static void reverseArrays(String[] arr) {


        for (int i = arr.length - 1; i >= 0; i--) {


        }
        System.out.println("Reversed of Array String : " + Arrays.toString(arr));

    }

    public static void descending(int[] arr) {

        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void combine2Arrays(int[] num1, int[] num2) {

        int[] num3 = new int[num1.length + num2.length];

        int i = 0;
        for (int each : num1) {
            num3[i] = each;
            i++;
        }
        for (int each : num2) {
            num3[i] = each;
            i++;
        }

        System.out.println("Combined of Two Arrays : " + Arrays.toString(num3));

    }

    public static void checkOfElements(int[] arr) {
        int num = 0;

        for (int each : arr) {
            if (each > 0) {
                num = each;
                System.out.println(num + " is a Positive number.");
            } else if (each < 0) {
                num = each;
                System.out.println(num + " is a Negative number.");
            } else {
                num = each;
                System.out.println(num + " is Zero.");
            }
        }
    }

    public static void grade(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Sorry! Invalid Score.");
            return;
            // System.exit(0);
        }

        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        System.out.println("Grade is : " + grade);


    }

    public static void removeDuplicate(String str) {

        String nonDup = "";

        for (String each : str.split("")) {

            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        System.out.println("Removed of Duplicates : " + nonDup);
    }

    public static void evenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print( i + " ");


            }

        }
    }

    public static void oddNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print( i + " ");

            }

        }
    }

    public static void shortestWord(String[] arr){

        int minLength = arr[0].length();
        for(String each : arr){
            int eachLength = each.length();

            if(eachLength < minLength){
                minLength = eachLength;
            }

        }
        System.out.println("Shortest word is : " + minLength + " characters ");
        System.out.println("===================================");

        for(String each : arr){
            int eachLength = each.length();
                if(eachLength == minLength){
                    System.out.println("Shortest word ==> " + each);
            }

        }

    }

    public static void longestWord(String[] arr){

        int maxLength = arr[0].length();
        for(String each : arr){
            int eachLength = each.length();

            if(eachLength > maxLength){
                maxLength = eachLength;
            }

        }
        System.out.println("Longest word is : " + maxLength + " characters ");
        System.out.println("===================================");

        for(String each : arr){
            int eachLength = each.length();
            if(eachLength == maxLength){
                System.out.println("Longest word ==> " + each);
            }

        }

    }

    public static void print3Letters(String[] arr){

        for (int i = 0; i <= arr.length -1; i++) {
            System.out.print(arr[i].substring(0,3)+" ,");

        }
        for(String each :  arr){
            System.out.print(each.substring(0,3) + " ,");
        }
        System.out.println();
    }

    public static void uniqueCharacters1(String str ){

        String uniques = "";

        for (int i = 0; i <= str.length()-1; i++) {
            char ch = str.charAt(i);

            int first = str.indexOf(ch);
            int last = str.lastIndexOf(ch);

            if(first == last){
                uniques += ch;
            }
        }

        System.out.println("Unique characters : " + uniques);

    }

    public static void uniqueCharacters2(String str ){

        String unique = "";
        for (int i = 0; i <= str.length()-1; i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = str.length()-1; j >= 0; j--) {
                char each = str.charAt(j);
                if(ch == each){
                    count += 1;
                }
            }
            if(count == 1){
                unique += ch;
            }
        }
        System.out.println("Unique characters : " + unique);

    }

    public static void findToUniqueWord(String[] words){

        for (int i = 0; i <= words.length-1; i++) {

            String each1 = words[i];
            int count = 0;

            for (int j = 0; j <= words.length-1; j++) {
                String each2 = words[j];

                if(each1.contains(each2)){
                    count += 1;
                }

            }

            if(count == 1){
                System.out.println(each1);
            }

        }
    }

    public static void occurrencesOfChar(char ch , String str){
        int count = 0;
       ch = 'a';
        for (int i = 0; i < str.length() - 1; i++) {
            char each = str.charAt(i);

            if(ch == each){
                count++;
                System.out.println(" The character " +"'"+ ch +"'"+" has been counted " + count + " times in the sentence.");
            }
        }



    }





}






