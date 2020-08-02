package day11_NestedIf_Switch;

public class DaysInMonth {

    public static void main(String[] args) {
        int month = 12;
        boolean days28 = month == 2; // if()
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11; // else if
        boolean invalid = month < 1 || month > 12; //else if

        // ==> else : boolean days31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12;
        //          : boolean days31 = days28 == false && days30 == false && invalid == false;
        String result = "";

        if (days28) {
            result = "28 days";
        } else if (days30) {
            result = "30 days";
        } else if (invalid) {
            result = "Invalid";
        } else {
            result = "31 days";
        }

        System.out.println(result);


    }
}
