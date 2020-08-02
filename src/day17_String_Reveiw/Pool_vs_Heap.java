package day17_String_Reveiw;

public class Pool_vs_Heap {

    public static void main(String[] args) {

        String s1 = "Cybertek";
        String s2 = "Cybertek";
        String s3 = new String("Cybertek");

        System.out.println(s1 == s2);
        System.out.println("=============================");
        System.out.println(s1 == s3);

    }
}
