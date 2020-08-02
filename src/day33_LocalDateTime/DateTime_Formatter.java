package day33_LocalDateTime;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

class DateTime_Formatting {

    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy,EEEE");

        LocalDate ld = LocalDate.of(2019,12,20);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));
    }
}
