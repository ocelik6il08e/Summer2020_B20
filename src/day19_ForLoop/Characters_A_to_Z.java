package day19_ForLoop;
/*
5. Write a program that will print out all letters in English alphabet in ascending order

 */
public class Characters_A_to_Z {
    public static void main(String[] args) {
//1.way
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
//2.way
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        System.out.println("=======================================");
//6. Write a program that will print out all letters in English alphabet in descedning order
//1.way
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println();
//2.way
        for (int i = 90; i >= 65; i--){
            System.out.print((char)i +" ");
        }
        System.out.println();


    }
}
