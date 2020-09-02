package day44_Constructor;

public class StudentObject {

    public static void main(String[] args){

        Student student1 = new Student("Mike",18,'M');
        Student student2 = new Student("Robert",28,'M');
        Student student3 = new Student("Julia",45,'F');


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }
}
