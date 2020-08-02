package day11_NestedIf_Switch;

public class NumbertoWords {

    public static void main(String[] args) {

        int number = 11;

        String result = "";


        if(number == 0){
            result = "Zero";
        } else if(number == 1){
            result = "One";
        }else if(number == 2){
            result = "Two";
        }else if(number == 3){
            result = "Three";
        }else if(number == 4){
            result = "Four";
        }else if(number == 5){
            result = "Five";
        }else if(number == 6){
            result = "Six";
        }else if(number == 7){
            result = "Seven";
        }else if(number == 8){
            result = "Eight";
        }else if(number == 9){
            result = "Nine";
        }else{   // ==> It means : else if ( num < 0 || num > 9) It is not mandatory.Also else statement much more easier.
            result = "Invalid";
        }

        System.out.println(result);


    }
}
