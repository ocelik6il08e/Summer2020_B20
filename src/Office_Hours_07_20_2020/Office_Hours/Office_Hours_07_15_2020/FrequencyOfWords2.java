package Office_Hours_07_20_2020.Office_Hours.Office_Hours_07_15_2020;

import java.util.Scanner;

public class FrequencyOfWords2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

        //str = str.toLowerCase(); ==> "javajavajavajavajava"

        int count = 0;

        while(str.contains("java")){
            str = str.replaceFirst("java","");
            count++;

        }
        System.out.println(count);
    }
}
