package day17_String_Reveiw;

public class startsWith_and_endsWith_Of_StringMethods {
    public static void main(String[] args) {
        String str = "Cybertek School";

        System.out.println(str.startsWith("CybABC")); // False
        System.out.println(str.startsWith("E") || str.startsWith("C"));
                                    //False    or    true ==> True

        String str2 = "Today is a great day";
        System.out.println(str2.endsWith("day")); // endsWith checks only last character.
    }
}
