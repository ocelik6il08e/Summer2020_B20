package day09_IfStatement;

public class Alcohol2 {

    public static void main(String[] args) {

        int age = 19;
        boolean hasID = true;

        if( age >= 21 && hasID){
            System.out.println("The costumer is eligible for buy alcohol products.");
        }
        else{
            System.out.println("The costumer IS NOT eligible for alcohol products.");
        }


    }
}
