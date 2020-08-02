package day33_LocalDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Times {

    public static void main(String[] args) {
      LocalTime time =  LocalTime.of(23,59,59);

        System.out.println(time);

        LocalTime timeNow = LocalTime.now();

        System.out.println(timeNow);

        System.out.println("==========================");

      LocalDateTime dt =  LocalDateTime.of(2020,12,03,15,11,59);

        System.out.println(dt);
        System.out.println(LocalDateTime.now());

    }
}
