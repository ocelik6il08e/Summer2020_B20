package day34_WrapperClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Task: use the LocalDate & time get the current date and time in the following format:
// Sunday, 09:51 AM, Jul/26/2020

public class Task {

    public static void main(String[] args) {

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime today = LocalDateTime.now();

        System.out.println(today);

        System.out.println("--------------------------------------------");

        System.out.println(today.format(dt));

    }
}