package day19_ForLoop;

/*
    1. write a program that can print all the ODD numbers
    between 0 ~ 100 that can be divisible by 3 & 5

 */
public class OddEven {
    public static void main(String[] args) {
// 1.Way
        for (int i = 1; i < 100; i += 2) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //2.way :
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();

            /*
             2. write a program that can print all the EVEN numbers
             between 0 ~ 100 that can be divisible by 3 & 5
             */
       //1.way
        for (int i = 0; i <= 100; i += 2) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //2.way
        for(int i = 0; i <= 100; i++){
            if(i%2 == 0){
                if( i%5 == 0 && i%3 == 0){
                    System.out.print(i+" ");
                }
            }
        }

        System.out.println();
    }

}
