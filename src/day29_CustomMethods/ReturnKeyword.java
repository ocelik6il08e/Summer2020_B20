package day29_CustomMethods;

public class ReturnKeyword {
    public static void main(String[] args) {
        grade(101);
        System.out.println("Task Completed");

        eligibleToBuy(24);
    }
    public static void grade( int score){
if( score < 0 || score > 87){
    System.out.println("Invalid Score");
    //System.exit(0); ==>for  Exit the whole system.
    return;
}
        char grade = (score >= 90)? 'A' : (score >= 80)? 'B' :(score >=70)? 'C' :(score >=60)? 'D': 'F';
        System.out.println("Grade is : "+grade);
    }

    public static void eligibleToBuy(int age){

        if(age < 21){
            System.out.println("You are NOT eligible for buy alcohols or cigarettes");
        }else{
            System.out.println("You are eligible for buy alcohols or cigarettes");
        }
    }
}
