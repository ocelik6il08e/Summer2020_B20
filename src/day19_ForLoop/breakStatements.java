package day19_ForLoop;

public class breakStatements {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            break;
        }
        System.out.println();
        System.out.println("=============================");

        for (char ch = 'A'; ch <= 'H'; ch++) {
            if (ch == 'C') {
                break;
            }
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("===========================");
        for (int x = 1000; x >= 100; x -= 100) {
            if (x == 500) {
                break;
            }
            System.out.print(x + " ");
        }
    }
}
