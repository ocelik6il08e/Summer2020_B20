package day07_Unary_ShortHand;
//  2. write a program that can check if a number is evenly divisible by 2, 3, 5
public class Divisible_2_3_5 {

    public static void main(String[] args) {

        int num = 113;
        boolean result1 = num % 2 == 0;
        boolean result2 = num % 3 == 0;
        boolean result3 = num % 5 == 0;

        System.out.println(num + " is divisible by 2: " + result1);
        System.out.println(num + " is divisible by 3: " + result2);
        System.out.println(num + " is divisible by 5: " + result3);

    }
}
