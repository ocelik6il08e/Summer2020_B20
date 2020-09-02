package day48_Inheritance.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String size, int age, char gender,String bread, double lb) {
        setInfo(name, size, age, gender,bread,lb);

    }
public void meow(){
    System.out.println(name+ " meowing");
}

}
