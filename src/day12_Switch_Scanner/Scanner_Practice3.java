package day12_Switch_Scanner;
import java.util.Scanner;

public class Scanner_Practice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your yearly gross please : ");

        double salary = scan.nextDouble();

        double weeklyRate = salary / 52;
        double hourlRate = weeklyRate/40;

        System.out.println("Your hourly gross rate is : $" + hourlRate);


    }
}
