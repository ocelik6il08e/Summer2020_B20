package day04_Variables;

public class Task_Employee_Info {

    public static void main(String[] args) {

        String employeeName = "Jack";
        int employeeId = 440069;
        String companyName = "WestMoon";
        String jobTitle = "Assistant Manager";
        int age = 26;
        char gender ='M';
        double salary = 68_000.00;
        boolean isFullTime = true;
        boolean isMarried = false;

        System.out.println("Employee's Name: " + employeeName);
        System.out.println("Employee's Company: "+companyName);
        System.out.println("Employee's ID: " + employeeId);
        System.out.println("Employee's Title: " + jobTitle);
        System.out.println("Employee's Gender: " + gender);
        System.out.println("Employee's Age: "+age);
        System.out.println("Employee's Salary: " +"$ "+ salary);
        System.out.println("Employee FullTime Position: " + isFullTime);
        System.out.println("Is Employee Married: " + isMarried);

    }
}
