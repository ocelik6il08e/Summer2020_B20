package day29_CustomMethods;

public class UniqueElements {

    public static void main(String[] args) {
        String[] arr = {"A","B","B","C"};
        uniques(arr);
        System.out.println("Hello");


    }

    public static void uniques(String[] arr){

        for(String a : arr){
            int count = 0;
            for (String each: arr) {
                if(a.equals(each)){
                    count++;
                }

            }
            if(count == 1){ //Unique
                System.out.print(a+" ");
            }
        }
        System.out.println();
    }
}
