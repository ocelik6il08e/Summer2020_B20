package day40_CustomClassPractice.Employee;

import java.text.DecimalFormat;

public class CapitalOne {

    public static void main(String[] args) {

        DecimalFormat dc = new DecimalFormat("0.00");

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();


        employee1.setEmployeeInfo("Onur",'M',"123457896","Manager",84000);
        employee1.getEmployeeInfo();


    }
}
