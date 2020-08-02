package day15_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which university did you graduate?");
        String nameOfUniversity = scan.nextLine();

        char fc = nameOfUniversity.charAt(0);
        char lc = nameOfUniversity.charAt(nameOfUniversity.length() -1);

        System.out.println(fc +""+lc);
    }
}
