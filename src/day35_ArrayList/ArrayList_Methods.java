package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<String> honorStudents = new ArrayList<>();
        honorStudents.add("Gazi");
        honorStudents.add("Mustafa");
        honorStudents.add("Kemal");
        honorStudents.add("Ataturk");

        honorStudents.set(0,"Maresal");
        System.out.println(honorStudents);
        honorStudents.remove(1);
        System.out.println(honorStudents.size());
        System.out.println(honorStudents);



        honorStudents.clear();
        System.out.println( honorStudents);
        System.out.println(honorStudents.size());
    }
}
