package day47_Encapsulations;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate DOB;

    private int ID;
    private long ssn;
    private String address;

    public Person(String name, int age, char gender, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
        this.ID = ID;
        this.ssn = ssn;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public long getSsn() {
        return ssn;
    }

    public String getAddress() {
        return address;
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", DOB: "+DOB;
    }
}
