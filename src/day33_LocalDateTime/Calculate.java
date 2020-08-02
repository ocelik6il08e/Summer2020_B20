package day33_LocalDateTime;

public class Calculate {
    public static void main(String[] args) {
        int a = 10;
        double b = 20;
        System.out.println(addition(a, b));

        System.out.println("==============================");

        float num1 = 10.1f;
        float num2 = 1.56f;
        System.out.println(addition(num1, num2));

        System.out.println("==============================");
        System.out.println(addition(10, 30));
        System.out.println("==============================");
        System.out.println(addition(9.5, 5));
        System.out.println("==============================");
        System.out.println(addition(1.1f, 5.0));
        System.out.println("==============================");
        System.out.println(addition(9.8f, 3));
        System.out.println("==============================");
        System.out.println(addition(8.6f, 6.5d));
        System.out.println("==============================");
        System.out.println(addition(100l, 98.36f));
        System.out.println("==============================");

        long x = 98;
        long y = 74;
        System.out.println(multiplication((int)x,(int)y));

    }


    public static int addition(int a, int b) {
        return a + b;

    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double addition(double a, int b) {
        return a + b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
}
