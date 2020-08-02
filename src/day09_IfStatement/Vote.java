package day09_IfStatement;

public class Vote {

    public static void main(String[] args) {

        int age = 17;
        boolean usCitizen = true;

        if( age >= 18 && usCitizen){
            System.out.println("The person is eligible for vote in The United States of America.");
        }
        else{
            System.out.println("The person IS NOT eligible for vote in The United States of America.");
        }
    }
}
