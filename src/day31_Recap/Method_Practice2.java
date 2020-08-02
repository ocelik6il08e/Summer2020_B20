package day31_Recap;

public class Method_Practice2 {

    public static void main(String[] args) {

        String palindromeName = "Madam";

        // System.out.println(reverse1(palindromeName));
       //  System.out.println(palindromeName.equalsIgnoreCase(reverse1(palindromeName)));

        reverse2(palindromeName);
        System.out.println(reverse2(palindromeName));
        System.out.println(palindromeName.equalsIgnoreCase(reverse2(palindromeName)));

    }

    public static void reverse1(String str ){ // Return-Type: Void

        String expectedResult = "";

        for(int i = str.length()-1; i >= 0; i--){
            expectedResult += str.charAt(i);
        }

        System.out.println(expectedResult);

    }
    public static String reverse2(String str ){ //Return-Type : String

        String expectedResult = "";

        for(int i = str.length()-1; i >= 0; i--){
            expectedResult += str.charAt(i);
        }

     return expectedResult;

    }


}
