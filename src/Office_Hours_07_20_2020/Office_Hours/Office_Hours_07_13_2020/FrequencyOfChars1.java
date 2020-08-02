package Office_Hours_07_20_2020.Office_Hours.Office_Hours_07_13_2020;

public class FrequencyOfChars1 {

    public static void main(String[] args) {

        String str ="OOPQQ";
        String nonDup ="";

        for(int i = 0; i <= str.length()-1; i++){

            String s = ""+str.charAt(i);
            System.out.println(s);

            if(!nonDup.contains(s)){
                nonDup += s;
            }
        }
        System.out.println(nonDup);

    }
}
