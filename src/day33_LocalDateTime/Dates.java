package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {

    public static void main(String[] args) {



    LocalDate DOB = LocalDate.of(2015,06,05);

        System.out.println(DOB);

        LocalDate todayDate  = LocalDate.now();
        System.out.println(todayDate);

        LocalDate y = LocalDate.of(2019,1,4);
        boolean result = y.isLeapYear();
        System.out.println("Is Leap year :" + result);

        System.out.println("==========================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = scan.nextInt();

        boolean result2 = LocalDate.of(year,1,1).isLeapYear();
        System.out.println("Is leap year : "+result2);

        System.out.println("=======================================");

        System.out.println("Enter year, birth month, birth day");
        LocalDate d =LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt());
        System.out.println(d);
        System.out.println("Is it leap year : "+d.isLeapYear());
}
}