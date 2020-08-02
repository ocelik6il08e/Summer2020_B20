package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Practice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(155);
        list.add(-65);
        list.add(95);
        list.add(60);
        list.add(55);
        list.add(0);



        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer each : list){
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }

        System.out.println("Max number is :"+max);
        System.out.println("Min number is :"+min);
    }
}


