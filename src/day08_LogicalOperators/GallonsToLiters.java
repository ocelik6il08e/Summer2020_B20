package day08_LogicalOperators;
/*
 write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 liter = 1/3.785

 */
public class GallonsToLiters {

    public static void main(String[] args) {
        double gallons = 20;
        double liters = 20;

        System.out.println(gallons + " gallons equal to " +( gallons * 3.785) + " liters.\n");
        System.out.println(liters + " liters equal to " +(int)( liters * 1/3.785) + " gallons.");



    }

}
