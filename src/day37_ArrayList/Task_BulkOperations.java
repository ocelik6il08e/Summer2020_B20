package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_BulkOperations {
    public static void main(String[] args) {


        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Ali", "Veli", "Ahmed", "Mehmed", "Turan", "Ahmed", "Suat"));

        // Remove employee name is Ahmed.
        employeeList.removeAll(Arrays.asList("Ahmed"));
        System.out.println("Updated day40_CustomClassPractice.Employee List : " + employeeList);
        System.out.println("=====================");

        // Remove all employee on list without 'Ali'.
        employeeList.retainAll(Arrays.asList("Ali"));
        System.out.println(employeeList);


    }
}