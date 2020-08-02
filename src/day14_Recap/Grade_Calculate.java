package day14_Recap;

import java.util.Scanner;

public class Grade_Calculate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Student's score: ");
        double score = scan.nextDouble();
        scan.close();

        String result;

        if ( score >= 0 && score <= 100) {
            if( score >= 90){
                result ="Excelent";
            }else if(score >= 80 && score <90){
                result ="Great";
            }else if (score >=70 && score <80){
                result = "Good";
            }else if(score >= 60 && score <70){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result ="Invalid Score";
        }
        System.out.println(result);


    }
}
