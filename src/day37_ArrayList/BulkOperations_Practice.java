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

        System.out.println("===================================================");

        ArrayList<String> namesOfGroup = new ArrayList<>();

        namesOfGroup.addAll(Arrays.asList("Obama", "Trump", "Washington", "Clinton", "Carter", "Ford"));
        System.out.println(namesOfGroup);
        System.out.println("==========");
        boolean names = namesOfGroup.containsAll(Arrays.asList("Kennedy", "Bush", "Nixon", "Eisenhower"));
        System.out.println(names);
        System.out.println("=============================");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 6, 6, 6, 6, 7, 7, 7, 8, 8, 9, 10, 11, 12, 13));
        System.out.println(nums);
        System.out.println("========");
        nums.removeAll(Arrays.asList(1, 2, 5, 10, 11));
        System.out.println(nums);
        System.out.println("======================================================================");

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.addAll(Arrays.asList(10, 10, 10, 10, 20, 20, 20, 30, 40, 60, 60, 70, 70, 80, 80, 90, 10, 11, 12, 13));
        System.out.println(nums2);
        System.out.println("========");

        nums2.retainAll(Arrays.asList(30, 11, 12, 13));
        System.out.println(nums2);


    }
}
