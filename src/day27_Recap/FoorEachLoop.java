package day27_Recap;

class ForEachLoop {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("=====================For Loop=========================");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("=====================Foreach Loop=====================");

        for (int each : arr) {

            System.out.print(each + " ");


        }
        System.out.println();
        System.out.println("=====================For Loop Reverse Order=====================");

        for (int i = arr.length-1 ; i>= 0 ; i--) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();

        int[] scores = { 10,20,30,40,50,60,70,80,90,100,110};

        for (int each: scores) {

            if(each%3 != 0){
                continue;


            }

            System.out.print(each+" ");
        }

        int[] score = {15,25,45,35,105,55,-45,-65,90};
        int max = score[0];
        int min = score[0];

        for (int each:score){
            if(each > max){
                max = each;
            }
            if(each< min){
                min = each;
            }
        }
        System.out.println();
        System.out.println("Maximum number of score :" + max);
        System.out.println("Minimum number of score :" + min);



    }
}
