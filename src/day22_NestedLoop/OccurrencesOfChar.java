package day22_NestedLoop;

import java.util.Scanner;

public class OccurrencesOfChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        String str = scan.nextLine();

        char ch = scan.next().charAt(0);



        int count = 0 ; // 1+1 = 2, frequency of ch in str





        for(int i=0; i <= str.length()-1; i++){

            //ababc

            char each = str.charAt(i);  // a  b a b c



            if( each == ch ){  // if true, means ch is occured in str

                count += 1;

            }

        }



    /*

            int index = 0;

            while(index <= str.length()-1  ){



                char each = str.charAt(index);  // a  b a b c



                if( each == ch ){  // if true, means ch is occured in str

                    count += 1;

                }



              index++;

            }

    */



        System.out.println(count);











    }







}