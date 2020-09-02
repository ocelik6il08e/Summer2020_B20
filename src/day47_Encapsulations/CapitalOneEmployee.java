package day47_Encapsulations;

public class CapitalOneEmployee {

    public String employeeName;
    public int age;
    public String jobTitle;

    public CapitalOneEmployee (String employeeName, int age, String jobTitle){

        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.age = age;

    }

    public static String companyName;

    static {
        companyName = "CapitalOne Bank";
    }

    private int ID;
    private double salary;
    private String address;



    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String toString(){
        return "Name: "+employeeName+", Age: "+age+", Job Title: "+jobTitle+", ID: "+getID()+", Salary: "+getSalary();
    }

}
