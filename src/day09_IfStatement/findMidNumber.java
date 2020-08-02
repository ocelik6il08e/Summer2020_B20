package day09_IfStatement;

public class findMidNumber {

    public static void main(String[] args) {

        int a = 65;
        int b = 3;
        int c = 16;

        boolean aIsMed = (a > b && a < c) || (a > c && a < b);
        boolean bIsMed = (b > a && b < c) || (b < c && b > a);
        boolean cIsMed = !aIsMed && !bIsMed;

        double med = 0;

        if(aIsMed){
            med = a;
        }
        if(bIsMed){
            med = b;
        }
        if(cIsMed){
            med = c;
        }
        System.out.println("Medium number is "+ med);
    }
}
