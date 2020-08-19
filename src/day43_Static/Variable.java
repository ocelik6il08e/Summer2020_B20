package day43_Static;

public class Variable {

    int b; // This is instance variable.

    static int s;

    public void method(){
        System.out.println(b); // Instance variable you can use without initialized outside of block.
    }

    public static void main(String[] args) {

    }

    public  static void method1(){}

    int a; // it is local variable.Local variable it can not be accessible outside of method.
           // Local variable it can not be used without initilazed outsie the block

}
