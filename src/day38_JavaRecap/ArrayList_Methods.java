package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    // remove, size, set, get, equals, contains, clear
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.addAll(Arrays.asList("BMW", "Mercedes", "Infiniti", "Toyota",
                "Ford", "Porsche", "Tesla", "BMW", "Honda", "Mercedes", "Jeep", "Lexus",
                "Mazda", "Volvo", "Audi", "Opel", "Pontiac", "Citroen", "Renault", "Ferrari"));

        cars.remove(0); //1.way of remove method with provide index number : remove => BMW
        cars.remove("Tesla"); // 2. way of remove method provide object name  : will remove => Tesla
        cars.removeAll(Arrays.asList("BMW")); //3.way of remove provide object name, but removeAll() methods
        // - remove all matching element.

        cars.removeIf(p -> p.toUpperCase().contains("M"));
        cars.retainAll(Arrays.asList("Ferrari"));
        System.out.println(cars);


        System.out.println("Grocery List :=====================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Salsa","Bread","Milk","Cheesse","Shampoo","Mango",
                "Orange", "Cucumber", "Watermelon", "Coke","Ice Cream", "Toilet Papers", "Towels"));

        boolean contain1 = groceryList.contains("Tomatoes");
        System.out.println(groceryList);
        System.out.println(contain1);

        boolean contain2 = groceryList.containsAll(Arrays.asList("Water", "Cips", "Chocolate", "Cigarette"));
        System.out.println(contain2);

        System.out.println("Total number of Items : " +groceryList.size());

        groceryList.set(groceryList.size()-1 , "Banana"); // Towels => Banana
        System.out.println(groceryList);

        groceryList.set(groceryList.indexOf("Ice Cream"),"Yogurt");
        System.out.println(groceryList);

        System.out.println("Clear :=======================================");
        groceryList.clear();
        System.out.println(groceryList);



    }
}
