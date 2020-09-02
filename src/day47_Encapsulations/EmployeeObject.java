package day47_Encapsulations;

public class EmployeeObject {

    public static void main(String[] args) {

        CapitalOneEmployee employee1 = new CapitalOneEmployee("Onur",38,"SDET");
        System.out.println(employee1.employeeName);
        System.out.println(employee1.age);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.companyName);

        employee1.setID(2121656565);
        employee1.setAddress("New Jersey, USA");
        employee1.setSalary(65000);
        System.out.println(employee1.getID());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());


        System.out.println("===============================================");

        System.out.println(employee1);
    }
}
