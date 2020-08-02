package day12_Switch_Scanner;
import java.util.Scanner;

public class Scanner_Practice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers please : ");

        int num1 = scan.nextInt();
        System.out.println("First number is : "+num1);
        int num2 = scan.nextInt();
        System.out.println("Second number is : "+num2);

        System.out.println("Summary is : " + (num1 + num2));
    }
}
