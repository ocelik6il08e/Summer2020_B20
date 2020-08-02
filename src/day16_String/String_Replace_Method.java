package day16_String;

public class String_Replace_Method {
    public static void main(String[] args) {

        String str = "I like to learn Java, Java is cool, Java is fun";
        str = str.replace("a, Java", "a, C#"); // "I like to learn C#, C# is coll";
        System.out.println(str);

        System.out.println("=====================================================");
        String email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println(email);

        System.out.println("=======================================================");
        String word = "Java";
        word = word.replace("a", "e");
        System.out.println(word);

        System.out.println("========================================================");
        str = str.replace("Java ", "Phyton ");
        System.out.println(str);

        System.out.println("========================================================");
        String str2 = "I like to leaRn Java";
        str2 = str2.replace('R','r');
        System.out.println(str2);




    }
}
