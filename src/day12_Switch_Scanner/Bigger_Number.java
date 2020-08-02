package day12_Switch_Scanner;
/*
write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
         `
            NOTE: DO NOT USE IF STATEMENT

 */

public class Bigger_Number {

    public static void main(String[] args) {

        double n1 = 599;
        double n2 = 290;
        double n3 = 562;

        boolean n1Bigger = n1 > n2 && n1 > n3;
        boolean n2Bigger = n2 > n1 && n2 > n3; //n1Bigger == false && n2 > n3;
        boolean n3Bigger = n1Bigger == false && n2Bigger == false; // !n1Bigger && !n2Bigger


        String result = ( n1Bigger)? " n1 is bigger number.":  (n2Bigger)? "n2 is bigger number.": "n3 is bigger number.";
//
//        if( n1Bigger) {
//            result = " n1 is bigger number.";
//        }
//        else if(n2Bigger){
//            result = "n2 is bigger number.";
//        }
//        else{
//            result ="n3 is bigger number."  ;
//        }

        System.out.println(result);

    }
}
