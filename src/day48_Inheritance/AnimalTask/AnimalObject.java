package day48_Inheritance.AnimalTask;

public class AnimalObject {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Winston","Medium",3, 'M',"Scottie Terrier",12.3);
        System.out.println(dog1.name);
        System.out.println(dog1.size);

        dog1.bark();
        dog1.sleep();
        dog1.eat();
        System.out.println(dog1.age);
        System.out.println( dog1.gender );
        System.out.println(dog1.breed);
        System.out.println(dog1.lb);
        System.out.println("=======================");
        System.out.println(dog1);
        System.out.println("=======================");

        Cat cat1 = new Cat("Altunhan","Small",1,'F',"Angora",8.1);
        System.out.println(cat1.name);
        System.out.println(cat1.size);
        cat1.meow();
        cat1.sleep();
        cat1.eat();
        System.out.println(cat1.age);
        System.out.println(cat1.gender);
        System.out.println(cat1.breed);
        System.out.println(cat1.lb);
        System.out.println("=======================");
        System.out.println(cat1);
        System.out.println("=======================");


    }
}
