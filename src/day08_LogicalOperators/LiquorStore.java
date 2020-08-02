package day08_LogicalOperators;

public class LiquorStore {
    public static void main(String[] args) {

        int age = 23;
        double hasPayment = 20;
        double itemprice = 19.80;

        boolean result = age >= 21 && hasPayment >= itemprice;

        if (result == true){
            System.out.println("The costumer eligible purchase this item.");
        }
        if ( result == false){
            System.out.println("The costumer IS NOT eligible purchase this item.");

        }

    }
}
