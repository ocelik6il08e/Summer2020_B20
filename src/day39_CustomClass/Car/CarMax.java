package day39_CustomClass.Car;

import day39_CustomClass.Car.Car;

public class CarMax {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();


        car1.setInfo("BMW","M5",2015,"White",12350,35600);
        car2.setInfo("Toyota","Camry",2019,"Gray",45000,21000);
        car3.setInfo("Honda","CR-V",2016,"Brown",64000,13500);
        car4.setInfo("Nissan","Murano",2011,"Navy",94000,6300);
        car5.setInfo("Mercedes","S600",2017,"Black",3900,34500);

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();

        car5.start();


    }
}
