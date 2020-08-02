package day17_String_Reveiw;

public class equals_Of_StringMethods {
    public static void main(String[] args) {
        // equals method is case sensetive method
        String s1 = "Cat";
        String s2 = new String("Cat");
        String s3 = new String("Cat");

        System.out.println(s1 == s2); //False
        System.out.println("===========================");
        System.out.println(s1.equals(s2));//True
        System.out.println("===========================");
        System.out.println(s2 == s3); //False
        System.out.println("===========================");
        System.out.println(s2.equals(s3));
        System.out.println("===========================");

        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4.equals(s5));
        System.out.println("===========================");
        System.out.println(s4 == s5);
        System.out.println("============================");

        //equalsIgnoreCase and is not case sensetive method
        System.out.println(s4.equalsIgnoreCase(s5));

        System.out.println("=============================");
        String s6 = "MuHtAr";
        String s7 = "muhtar";
        System.out.println(s6.equalsIgnoreCase(s7));
        System.out.println(s6 == s7);


    }
}
