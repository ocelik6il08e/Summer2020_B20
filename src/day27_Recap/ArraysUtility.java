package day27_Recap;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {
        String[] names = {"Onur","Vildan","Deniz","Canan","Amy","Hurmuz","Celik","Steel"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
        System.out.println("=================================");

        int[] score = {15,25,45,35,105,55,-45,-65,90};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

        System.out.println("Maximum number is: "+score[score.length-1]);
        System.out.println("Minimum number is: "+score[0]);

    }
}
