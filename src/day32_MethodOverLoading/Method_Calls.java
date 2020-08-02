package day32_MethodOverLoading;
import Library.Util;

import java.util.Arrays;

public class Method_Calls {

    public static void main(String[] args) {

        String firstName = "durSunAli";
        String lastName = "erZinCanLI";

        String fullName;

        fullName = Util.formatFullName(firstName,lastName);
        String uniques = Util.uniques(fullName);
        System.out.println(uniques);
        String reversedName = Util.reverse(fullName);
        System.out.println(fullName);

        System.out.println("====================================");

        int[] a =  {200,400,500,200,1000,50,40,30,400,60,78};
        int n = 2500;
        a = Util.addElement(a, n);

        System.out.println( Arrays.toString(a) );


    }
}
