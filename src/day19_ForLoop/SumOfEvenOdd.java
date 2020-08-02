package day19_ForLoop;
/*
3. write a program that can calculate the sum of all the even numbers between 1 ~ 100

 */
public class SumOfEvenOdd {
    public static void main(String[] args) {

        int sumOfEven = 0;
        for(int i =0; i <= 100; i += 2){

            sumOfEven += i;

           // System.out.print(sum + " ");
        }
        System.out.println(sumOfEven);
        System.out.println("=======================");
        int sumOfEven2 = 0;
        for(int i = 0; i <=100; i++) {
            if (i % 2 == 0) {
                sumOfEven2 += i;
            }
        }
            System.out.println(sumOfEven2);

        System.out.println("=======================");

        /*
        4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100

         */
        int sumOfOdd= 0;
        for( int i = 1; i <= 99; i +=2){
            sumOfOdd += i;

        }
        System.out.println(sumOfOdd);
        System.out.println("=========================");
        int sumOfOdd2 = 0;
        for(int i = 0; i <= 100; i++){
            if(i %2 != 0){
                sumOfOdd2 += i;
            }
        }
        System.out.println(sumOfOdd2);
        }


    }
