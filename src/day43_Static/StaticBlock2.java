package day43_Static;

public class StaticBlock2 {

    static int a = 100;
    static String b = "CyberTek";


    static {
       // a = 100;
        // b= "CyberTek";
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
