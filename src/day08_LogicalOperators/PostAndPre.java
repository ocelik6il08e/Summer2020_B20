package day08_LogicalOperators;

/*
 manually calculate the following code fragments:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
Co
 */

public class PostAndPre {
    public static void main(String[] args) {
        int a = 25;
        int b = -a++ + - --a * a-- % 2;

        System.out.println(b);





    }
}
