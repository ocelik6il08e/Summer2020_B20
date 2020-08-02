package day03_sequences_Variables;

public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Hello Everyone \nMy name is Cybertek.");
        // it makes sperate line : \n (appends new line to the message)
        System.out.println("\tI am in Virginia\n");
        // it makes paragraph space : \t (Horizontal tab is appends paagraph space)
        System.out.println("\n\n\t\t\tI love programming"); //

        System.out.println("\\"); // this prints me one back slash
        System.out.println("/"); // this prints me one front slash

        System.out.println("\\\\"); // this prints me two back slash
        System.out.println("//"); // this prints me two front slash

        System.out.println("My name is \'ONUR\'"); // 'ONUR' (\' : it adds a single qoute.
        System.out.println("My name is 'ONUR'"); // Same result.

        System.out.println("My favorite TV-series : \"Game of Thrones\""); // Double qoute : \\"


    }
}
