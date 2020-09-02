package day49_Inheritance.ScrumTeamTask;

public class Person {


    public String name;
    public int age;
    public char gender;


    private void eat(){ // we don'twant this to be inherited to the sub class
        System.out.println(name + " is eating ");
    }
    private void walk(){// we don'twant this to be inherited to the sub class
        System.out.println(name + " is walking ");
    }
    private void sleep(){// we don'twant this to be inherited to the sub class
        System.out.println(name + " is sleeping ");
    }

    public void setEmployeeInfo(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


}
