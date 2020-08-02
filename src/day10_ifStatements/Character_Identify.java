package day10_ifStatements;

public class Character_Identify {

    public static void main(String[] args) {

        char character = '%';

        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 120);
        boolean isDigit = character >= 48 && character <= 57;
        boolean isSpecial = !isAlphabetic && isDigit;

        String alphabet = "";

        if(isAlphabetic){
          alphabet = character + " is alphabetic character.";
          // System.out.println(character + " is Alphabetic character.");
        }
        else  {
            alphabet = character + " is not Alphabetic character.";
            // System.out.println(character + " is not Alphabetic character.");
        }
        System.out.println(alphabet);

        String digit = "";
        if(isDigit == true){
            digit = character + " is a digit.";
        }
        else{
            digit = character + " is not a digit.";

        }
        System.out.println(digit);

        String special = "";

        if(isAlphabetic){

            special = character + " is a special character.";
        }
        else {
            special = character + " is not a special character.";
        }

        System.out.println(special);


    }
}
