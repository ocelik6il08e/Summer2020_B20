package day41_Recap;

public class Carpet {
/*
1. create a custom class for the Carpet class that should contain the following:

instance variables:
  width, length, unitPrice, isPersian (boolean)
instance methods:
  customOrder(): sets the carpet' width, length, unitPrice, & isPersian
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        getCarpetInfo(): should be able to display all the info of the carpet including the
                        total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitPrice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects
            ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular
            carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets

 */


    double width;

    double length;

    double unitPrice;

    boolean isPersian;





    public void customOrder(double width, double length, double unitPrice, boolean isPersian ){

        this.width = width;

        this.length = length;

        this.unitPrice = unitPrice;

        this.isPersian = isPersian;

        // instance         local

    }



    public double calcCost(){

        double totalPrice = (width * length)* unitPrice; // 200

        if(isPersian){

            totalPrice+= 200;

        }

        // return isPersian ? totalPrice+200:totalPrice

        return  totalPrice ;

    }



    public void getCarpetInfo(){

        System.out.println("=============================");

        System.out.println("Width: "+width);

        System.out.println("Length: "+ length);

        System.out.println("Unit Price: "+ unitPrice);

        System.out.println("Persian Carpet: "+isPersian);

        System.out.println("Total Price: "+ calcCost());

        System.out.println("=============================");

    }









/*

carpet1

carpet2

carpet3

 */







}