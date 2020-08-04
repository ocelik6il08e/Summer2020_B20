package Office_Hours.Office_Hours.Office_Hours_07_15_2020;

public class FrequencyOfWords {

    public static void main(String[] args) {

        String str = "catcatdogcatcatcatdogdogcatcatcat";
        str = str.toLowerCase();


        int catCount = 0;

        while (str.contains("cat")) {
            catCount++;
            // str =  str.replace("cat",""); // replace all cats
            str = str.replaceFirst("cat", ""); // replace just first cat
        }
        int dogCount =0;
        while (str.contains("dog")) {
            dogCount++;
            // str =  str.replace("cat",""); // replace all cats
            str = str.replaceFirst("dog", ""); // replace just first cat
        }


        /* while statement fit for repeating statement because if statement does not works again again again.
        if statement one time works.However, while loop is repeating statement. it works over and over again.

        System.out.println(str);

        if (str.contains("cat")) {
            count++;
            str = str.replaceFirst("cat", ""); // replace just first cat
            */


        System.out.println(catCount);
        System.out.println(dogCount);
        System.out.println(catCount == dogCount);
    }
}