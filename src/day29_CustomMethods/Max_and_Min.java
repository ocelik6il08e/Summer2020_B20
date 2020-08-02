package day29_CustomMethods;

public class Max_and_Min {
    public static void main(String[] args) {
        int[] numbers = {10,-20,15,29,-11,78,-99,56};
        maxNum(numbers);
        minNum(numbers);
    }


    public static void maxNum(int[] arr){

        int max =arr[0];
        for (int each : arr) {

           if(each > max){
               max = each;
           }
        }
        System.out.println("Maximum number is :"+max);
    }
    public static void minNum(int[] arr){

        int min =arr[0];
        for (int each : arr) {

            if(each < min){
                min = each;
            }
        }
        System.out.println("Minimum number is :"+min);
    }
}
