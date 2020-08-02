package day17_String_Reveiw;

public class caontains_Of_StringMethods {
    public static void main(String[] args) {

        //contains : included or not
        String str = "Java, C#, Python, Ruby, C++";

        System.out.println(str.contains("Java")); //True
        System.out.println(str.contains("java")); //False because java is case sensetive
        System.out.println(str.toLowerCase().contains("java")); //True
        System.out.println("=====================");
        String str3 = "ABCD";
        System.out.println(str3.contains("D"));



    }
}
