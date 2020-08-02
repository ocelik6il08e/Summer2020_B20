package day18_ForLoop;

public class Practice_Of_Loop {
    public static void main(String[] args) {
        for (int name = 0; name < 5; name++) {
            System.out.println("William Paterson");
        }
        System.out.println("================================================");

        for (int i = 1; i <= 100; ++i) {
            System.out.print(i + " ");
        }

        System.out.println("\n===============================================");

        for(int i = 100; i >= 1; i-- ){
            System.out.print(i+" ");
        }
    }
}