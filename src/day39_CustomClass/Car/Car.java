package day39_CustomClass.Car;

public class Car {
    /*

    Attributes :
    model, brand, year, color, mileage, Price ...

     */

    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void setInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice) {

        brand   = carBrand;
        model   = carModel;
        year    = carYear;
        color   = carColor;
        mileage = carMileage;
        price   = carPrice;

    }

    public void getInfo() {
        System.out.println(year + " " + brand + " " + year + " " + color + " " + mileage + " $" + price);
    }

    public void start(){

        System.out.println(brand + " " + model + " is started.");

    }



}
