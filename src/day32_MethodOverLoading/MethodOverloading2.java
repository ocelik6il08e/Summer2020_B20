package day32_MethodOverLoading;

public class MethodOverloading2 {

    public static void main(String[] args) {


       additionOf2(10,20);
      additionOf3(10,20,30);
      additionOf4(10,20,30,40);

        System.out.println("=======================================");

        addition(10,20);
        addition(10,20,30);
        addition(10,20,30,40);


    }

    public static void additionOf2(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void additionOf3(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    public static void additionOf4(int num1, int num2, int num3, int num4) {
        System.out.println(num1 + num2 + num3 + num4);
    }

    //=====================================================

    public static void addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void addition(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    public static void addition(int num1, int num2, int num3, int num4) {
        System.out.println(num1 + num2 + num3 + num4);

    }
}