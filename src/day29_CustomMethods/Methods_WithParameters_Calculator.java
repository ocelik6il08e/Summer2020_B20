package day29_CustomMethods;

public class Methods_WithParameters_Calculator {

    public static void main(String[] args) {
        calculator(125,'*',69);

    }

    public static void calculator(double num1, char operator, double num2){

        switch (operator){
            case '+':
                System.out.println("Addition :" + (num1+num2));
                break;
            case '-':
                System.out.println("Subtraction :" + (num1-num2));
                break;
            case '/':
                System.out.println("Division :" + (num1/num2));
                break;
            case '*':
                System.out.println("Multiplication :" + (num1*num2));
                break;
            default:
                System.out.println("Invalid Entries");
        }
    }
}
