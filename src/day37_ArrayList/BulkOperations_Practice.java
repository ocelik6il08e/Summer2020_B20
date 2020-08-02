package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Ali");
        students.add("Jack");
        students.add("Henry");
        students.add("Duke");
        students.add("Frank");
        students.add("Will");

        // verify that the names Ulku,Busra are contained in students list

        boolean r1 = students.containsAll(Arrays.asList("Ulku", "Busra", "Onur"));
        System.out.println(r1);
        System.out.println("======================");
        boolean r2 = students.containsAll(Arrays.asList("Frank", "Henry", "Ali"));
        System.out.println(r2);

    }
}
