package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Practice {

    public static void main(String[] args) {

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i <= 50; i++) {

            if(i % 2 == 0 ){

                evenList.add(i);
            }else{
                oddList.add(i);
            }

        }

        System.out.print(evenList);
        System.out.println();
        System.out.print(oddList);
        System.out.println();
        System.out.println("------------------------------------------------");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add(0,"Apple");
        groceryList.add(1,"Orange");
        groceryList.add(2,"Banana");
        groceryList.add(3,"WaterMelon");
        groceryList.add(4,"Mango");
        groceryList.add(5,"Avocado");


        for (int i = groceryList.size() -1 ; i >= 0 ; i--) {
            System.out.println(groceryList.get(i));
        }
        System.out.println("------------------------------------------");
        for(String each : groceryList){
            System.out.print(each + " ,");
        }


    }
}
