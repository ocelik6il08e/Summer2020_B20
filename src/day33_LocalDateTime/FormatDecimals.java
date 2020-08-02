package day33_LocalDateTime;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class FormatDecimals {

    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("0.00");

        double a = 22 / 7.0;

        int x = 55/3;

        System.out.println(a);
        System.out.println(df.format(a));
        System.out.println(x);
        System.out.println(df.format(x));







    }
}
