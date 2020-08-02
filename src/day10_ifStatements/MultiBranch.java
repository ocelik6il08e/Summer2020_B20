package day10_ifStatements;

public class MultiBranch {

    public static void main(String[] args) {
        int number = 56;

        if(number > 0 ){
            System.out.println(number + " is a positive number.");
        }
        else if (number < 0){
            System.out.println(number + " is a negative number.");
        }
        else{
            System.out.println(number + " is zero.");
        }

    }
}
