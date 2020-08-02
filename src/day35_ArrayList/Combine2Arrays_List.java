package day35_ArrayList;

import java.util.ArrayList;

public class Combine2Arrays_List {
    public static void main(String[] args) {

        String[] group1 = {"Ali","Cenk","Fuat","Dursun"};
        String[] group2 = {"Henry","Eric","Joe","Frank"};


        ArrayList<String> names = new ArrayList<>();

        for(String each : group1){
            names.add(each);

        }
        for(String each : group2){
            names.add(each);
        }

        System.out.println(names);

    }
}
