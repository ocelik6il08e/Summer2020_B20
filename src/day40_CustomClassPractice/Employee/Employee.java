package day40_CustomClassPractice.Employee;

public class Employee {

    String name;
    char gender;
    String SSN;
    String jobTitle;
    double salary;

    public void setEmployeeInfo(String employeeName, char employeeGender, String employeeSSN, String employeeJobTitle, double employeeSalary){
        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;

    }
    public void getEmployeeInfo(){

        System.out.println("Name: "+name+", Gender: "+gender+", JobTitle: "+jobTitle+", Salary: "+salary);
        String ssn = ""+SSN;
        System.out.println("Last four digits of SSN: "+  ssn.substring(ssn.length()-4)    );

    }
    }

