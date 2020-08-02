package day26_MultiDimensionArray;

import java.util.Arrays;

public class MultiDArray_Practice1 {

    public static void main(String[] args) {
        /*
        Testers : {"Lilia, "Odina", "Chistina,"Ekrem"}
        Developers :{"Ahmet","Erfan",Roza","Sarah}
        SM:{"Nuramet"}
        PO:{"Nadir"}
        BA:{"Alex"}

        ScrumTeam: Testers, Developers, SM, PO,BA
         */

        String[] testers = {"Lilia", "Odina", "Chistina", "Elkem"};
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] SM = {" Nuramet"};
        String[] PO = {"Nadir"};
        String[] BA = {"Alex"};

        String[][] scrumTeam = {testers, developers, SM, PO, BA};
        System.out.println(Arrays.deepToString(scrumTeam));


        System.out.println("======================================");

        for(String[] each : scrumTeam){
            System.out.println(Arrays.deepToString(each));

        }
        System.out.println("======================================");
        System.out.println(Arrays.deepToString(scrumTeam));
    }
}
