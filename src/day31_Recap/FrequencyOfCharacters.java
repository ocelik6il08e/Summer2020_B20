package day31_Recap;

import Library.Util;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AABBBCCC"; // ==> A2B3C3
        String expectedResult = "";
        String nonDup = Util.removeDup(str);

        for (char each: nonDup.toCharArray()){


        }


        System.out.println(nonDup);

        char ch1 = nonDup.charAt(0); //A
        int count = Util.frequency(str,ch1);//
        expectedResult += ""+ch1 +count;

        char ch2 = nonDup.charAt(1); //A
        int count2 = Util.frequency(str,ch2);//
        expectedResult += ""+ch2 +count2;

        char ch3 = nonDup.charAt(2); //A
        int count3 = Util.frequency(str,ch3);//
        expectedResult += ""+ch3 +count3;

        System.out.println(expectedResult);


    }
}
