package day46_ConstructorCalls;

import day46_ConstructorCalls.Employee;

import java.util.ArrayList;

public class CallEmployeeObjects {


    public static void main(String[] args) {

        Employee newEmployee1 = new Employee("Onur Ceyhan");
        System.out.println(newEmployee1);
        System.out.println("=======================================================");

        Employee newEmployee2 = new Employee("Tunc Bilek","Assistance Manager");
        System.out.println(newEmployee2);
        System.out.println("=======================================================");
        Employee newEmployee3 = new Employee("Ayse Fatma","Sales Manager",31234);
        System.out.println(newEmployee3);
        System.out.println("=======================================================");
        Employee newEmployee4 = new Employee("Dursun Gitmez","Security man",41234,52000);
        System.out.println(newEmployee4);



    }
}
