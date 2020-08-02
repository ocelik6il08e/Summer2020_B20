package day16_String;

public class substringpracticeExtra {
    public static void main(String[] args) {


        String str = "I like to drink Pepsi";
        String whatDrink = str.substring(16);

        System.out.println(whatDrink); // Pepsi
        System.out.println(str.substring(10, 15)); // drink
        System.out.println(str.substring(10)); // drink Pepsi
        System.out.println(str.substring(7, 9)); // to
        System.out.println(str.substring(2, 6)); // like
        System.out.println(str.substring(0, 1)); // I
        System.out.println(str.substring(0)); // I like to drink Pepsi

    }
}
