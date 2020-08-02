package day22_NestedLoop;

public class Nest_Loop_Practice5 {
    public static void main(String[] args) {
        int i =0;
        while(i <= 7){
            for (int j = 7; i <=j ; j--) {
                System.out.print("*");

            }
            System.out.println();
           i++;
        }


    }
}
