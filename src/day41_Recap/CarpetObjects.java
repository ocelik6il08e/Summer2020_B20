package day41_Recap;

public class CarpetObjects {

    public static void main(String[] args) {


        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(4.5, 3.5, 8.99, true);
        carpets[1].customOrder(6.0, 4.0, 12.99, false);
        carpets[2].customOrder(3, 4, 24.99, true);
        carpets[3].customOrder(2, 6, 5.99, false);
        carpets[4].customOrder(1, 18, 6.50, false);

        for (Carpet each : carpets) {
            each.getCarpetInfo();
        }

    }
}