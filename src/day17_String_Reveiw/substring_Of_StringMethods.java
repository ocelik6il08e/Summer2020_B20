package day17_String_Reveiw;

public class substring_Of_StringMethods {
    public static void main(String[] args) {

        String str = "I like Java Lanquage";
        //index ==>   01234567891011..

        System.out.println(str);
        System.out.println("==========================================");
        String word = str.substring(7,10+1);
        System.out.println(word);
        System.out.println("===========================================");
        String word2 = str.substring(12,str.length());
        System.out.println(word2);
        System.out.println("==============================================");
        String word3 = str.substring(12);
        System.out.println(word3);
        System.out.println("==============================================");
        String word4 = str.substring(2,5+1);
        System.out.println(word4);


        // Ending index is excluded but beginig index is inclueded.

    }
}
