package day09_IfStatement;

public class Alcohol {

    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        boolean eligible = age >= 21 && hasID;
        String result = "";


        if(eligible == true ) {
          result =  "The costumer is eligible buy for alcohol producuts.";
        }
        if(eligible == false ){
            result = "The costumer IS NOT eligible buy for alcohol products.";
        }
        System.out.println(result);
    }
}
