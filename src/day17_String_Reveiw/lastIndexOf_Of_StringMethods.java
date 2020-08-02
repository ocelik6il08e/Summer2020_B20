package day17_String_Reveiw;

public class lastIndexOf_Of_StringMethods {
    public static void main(String[] args) {

        String str = "Java Java Java";
        int l = str.lastIndexOf("J");
        int l2 =str.indexOf("J");
        int l3 =str.indexOf(" Java ") +1 ;
        int l4 = str.lastIndexOf(" Java");

        System.out.println(l);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
    }
}
