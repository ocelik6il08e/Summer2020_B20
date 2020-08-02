package day29_CustomMethods;

public class Methods_WithoutParameters3 {

    public static void main(String[] args) {
        OddNumbers();
        System.out.println("Good Morning");

        EvenNumbers();
        System.out.println("Hello Afternoon");
    }


    public static void OddNumbers() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void EvenNumbers() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

