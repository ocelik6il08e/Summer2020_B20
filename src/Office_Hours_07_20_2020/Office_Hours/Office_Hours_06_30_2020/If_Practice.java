package Office_Hours_07_20_2020.Office_Hours.Office_Hours_06_30_2020;

public class If_Practice {

    public static void main(String[] args) {
        int num = 305;

        if(num %2 == 0){
            System.out.println("The number " +num+" is a Even Number: ");
        }
        if(num %2 !=0){
            System.out.println("The number "+num+" is a Odd number");
        }

        String result = num%5 == 0 ? "The number is bigger than 5 or equal it" : "you can not dive it to 5";
        System.out.println(result);

        }
    }

