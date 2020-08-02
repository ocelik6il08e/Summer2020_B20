package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Practice1 {

    public static void main(String[] args) {

        String[] names = {"Henry First", "Steve Jersey", "Robbert River", "Ahmad Town", "Frank Hollywood"};
        LocalDate[] BOD = {
                LocalDate.of(1980,02,03),
                LocalDate.of(1981,06,11),
                LocalDate.of(1982,12,17),
                LocalDate.of(1983,05,21),
                LocalDate.of(1989,10,28),
        };

        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i] + ": "+BOD[i]);

        }
        System.out.println("=====================================");

        for(LocalDate each : BOD){
            if(each.isLeapYear()){
                continue;

            }
            System.out.println(each);
        }
    }
}
