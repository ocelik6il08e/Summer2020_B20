package day45_Constructor;

public class ConstructorSum {

    public static void main(String[] args) {
        new ConstructorSum(15, 25);
        System.out.println("===========================");
        new ConstructorSum(10, 21, 16);
        System.out.println("===========================");
        new ConstructorSum(11.2, 0.8);
        System.out.println("===========================");
        new ConstructorSum(26.49, 17.71, 28.63);
    }


    public ConstructorSum(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    public ConstructorSum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + sum);
    }

    public ConstructorSum(double a, double b) {
        double sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    public ConstructorSum(double a, double b, double c) {
        double sum = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + sum);
    }
}
