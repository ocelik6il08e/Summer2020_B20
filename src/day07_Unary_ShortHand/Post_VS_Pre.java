package day07_Unary_ShortHand;

public class Post_VS_Pre {
    public static void main(String[] args) {
        // Task 3
        int x = 4;
        int y = x * 4 - x++;
        System.out.println(y);

        System.out.println("=============================");

        //Task 2 :

        int a = 50;
        int x1 = --a;
        int x2 = a++;
        int x3 = a--;
        int x4 = a++;

       a = --a + a++ + a-- + a++;
        System.out.println(a);

        System.out.println("===========================");
        System.out.println(x1);  // --a  : 49
        System.out.println(x2);  // a++  : 49
        System.out.println(x3);  // a--  : 50
        System.out.println(x4);  // a++  : 49


        // Task 1




    }
}

