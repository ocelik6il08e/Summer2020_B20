package day09_IfStatement;

public class findMaxNumber {
    public static void main(String[] args) {

        int a = 21;
        int b = 69;
        int c = -96;

        boolean aMax = a > b && a > c == true;
        boolean bMax = b > a && b > c == true;
        // aMax == false && b > c;
        boolean cMax = c > a && c > b == true;
        // !aMax && !bMax;


        double max = 0;

        if (aMax) {
            max = a;
        }
        if (bMax) {
            max = b;
        }
        if (cMax) {
            max = c;

        }

        System.out.println("Maximum number is " + max);


    }
}
