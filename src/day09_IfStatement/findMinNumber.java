package day09_IfStatement;

public class findMinNumber {

    public static void main(String[] args) {
        double a = 100;
        double b = -123;
        double c = 200;

        boolean aIsMin = a < b && b < c;
        boolean bIsMin = aIsMin == false && b < c;
        // b < a && b < c;
        boolean cIsMin = !aIsMin && !bIsMin;
        // c < a && c < b;
        // aIsMin == false && bIsMin == false;

        double min = 0;

        if (aIsMin) {
            min = a;
        }
        if (bIsMin) {
            min = b;
        }
        if (cIsMin) {
            min = c;
        }

        System.out.println("Minimum number is " + min);
    }
}
