package day17_String_Reveiw;

public class length_Of_StringMethods {
    public static void main(String[] args) {

        // length method counts total charecters. length ==> int : It starts "1" and it returns int data.
        // (Index starts "0")


        String str = "Cybertek";
        int l = str.length();
        System.out.println(l);

        char ch = str.charAt(l-1);
        System.out.println(ch);


    }
}
