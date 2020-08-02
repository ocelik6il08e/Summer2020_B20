package day021_Loops;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        int a = 163;
        int b = 16;
        int count = 0;

        if(b == 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }

        while (a >= b){

            a -= b;
            count++;
        }
        System.out.println(a);// remainder of a
        System.out.println(count); //times of subtractions

    }
}
