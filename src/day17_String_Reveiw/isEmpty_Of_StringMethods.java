package day17_String_Reveiw;

public class isEmpty_Of_StringMethods {
    public static void main(String[] args) {

        //isEmpty: checks if the length of string is 0
        String str = "  ";
        System.out.println(str.isEmpty());

        str.trim();
        System.out.println(str.isEmpty());

        String str2 = "Cybertek";
        System.out.println(str.isEmpty());

        str2 ="";
        System.out.println(str2.isEmpty());
    }
}
