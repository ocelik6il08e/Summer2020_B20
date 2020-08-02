package day23_Arrays;

public class Array_Shopping {
    public static void main(String[] args) {

        String[] list = new String[7];
        list[0] = "Toilet Paper";
        list[1] = "Hand Sanitizer";
        list[4] = "Eggs";
        list[6] = "Corona Beer";
        list[2] = "Bread";
        list[3] = "Milk";
        list[5] = "Water";

        for (int i = 0; i <= list.length - 1; i++) {
            System.out.println(list[i]);

        }


    }
}
