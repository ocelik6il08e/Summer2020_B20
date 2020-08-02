package day29_CustomMethods;


public class Methods_WithParameters_Eligibility {

    public static void main(String[] args) {


        vote("Henry",38,true);
        buyAlcohol(true,19);


    }

    public static void vote(String name, int age, boolean citizenship){
        boolean eligibilityToVote = age >= 18 && citizenship == true;
        if(eligibilityToVote){
            System.out.println(name+ " is eligible to vote for Presidential Election of 2020.");
        }else{
            System.out.println(name+ " is NOT eligible to vote for Presidential Election of 2020.");
        }
    }
    public static void buyAlcohol(boolean hasID, int age) {
        if(hasID == true && age >= 21){
            System.out.println("Eligible for buy alcohol.");
        }else{
            System.out.println("Not Eligible for buy alcohol.");
        }
    }

}
