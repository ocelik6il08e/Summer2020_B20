package day45_Constructor;


import java.util.ArrayList;
import java.util.Arrays;

/*
  create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list

 */
public class ShoppingList {

    public static void main(String[] args) {
        Item item1 = new Item("Apple",1.25,121);
        Item item2 = new Item("Milk",3.79,10);
        Item item3 = new Item("Eggs",5.79,50);
        Item item4 = new Item("Orange",0.99,90);
        Item item5 = new Item("Water",2.99,60);
        Item item6 = new Item("Pasta",0.50,35);

        ArrayList<Item> list = new ArrayList<>();
        list.addAll(Arrays.asList(item1,item2,item3,item4,item5,item6));

        System.out.println("Items : " + list.size());
        double totalCost = 0;

        for(Item each : list){
            totalCost += each.calculateCost();
        }
        System.out.println("Total price of Shopping List : " + totalCost);

        System.out.println("==================================================================");

        Item[] items = {item1,item2,item3,item4,item5,item6};
        double totalCost2 = 0;

        for (int i = 0; i <= items.length-1; i++) {

             totalCost2 += items[i].calculateCost();
        }
        System.out.println("Total price of Shopping List : "+ totalCost2);
    }
}
