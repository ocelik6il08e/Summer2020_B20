package day39_CustomClass.Car;

import day39_CustomClass.Car.Car;

public class CarObjects {
    public static void main(String[] args) {


       Car car1 = new Car();
        car1.setInfo("Honda","Accord",2019,"Gray",39800.6,18900);
/*

        car1.brand = "Honda";
        car1.model = "Accord";
        car1.year = 2020;
        car1.color = "Burgundy";
        car1.mileage= 101;
        car1.price = 28950.00;
*/



        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println( car1.year);
        System.out.println(car1.color);
        System.out.println( car1.mileage);
        System.out.println(car1.price);

        System.out.println("===========================================");
        // each object has its own copy of instance variables

        Car car2 = new Car();
        car2.setInfo("Mercedes","G550",2020,"Red",10,44900.00);

       /*
        car2.brand = "Mercedes";
        car2.model = "G 550";
        car2.year = 2020;
        car2.color = "Red";
        car2.mileage= 10;
        car2.price = 44900.00;
*/
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println( car2.year);
        System.out.println(car2.color);
        System.out.println( car2.mileage);
        System.out.println(car2.price);

        System.out.println("====================================================");

        Car car3 = new Car();
        car3.setInfo("Audi","A7",2017,"White",32000,35000);
        car3.getInfo();

        System.out.println("====================================================");

        Car car4 = new Car();
        car4.setInfo("Jeep","Wrangler",2015,"Green",69000,14500);
        car4.getInfo();




    }
}