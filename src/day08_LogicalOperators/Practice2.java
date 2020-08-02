package day08_LogicalOperators;

public class Practice2 {

    public static void main(String[] args) {
        String firstName = "Conor";
        String lastName = "McNugget";
        int age = 12;
        String citizen1 = "TURKEY";
        String citizen2 = "FRANCE";

        boolean eligibleAge = age >= 18;
        boolean usCitizenStatus = citizen1 == "USA" || citizen2 == "USA";
        boolean eligibleVote = eligibleAge && usCitizenStatus == true;


        System.out.println(firstName +" "+ lastName +" is eligible for vote in the USA's efkpeefopfPresident Election of 2020 : " +eligibleVote);
    }
}
