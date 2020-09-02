package day47_Encapsulations;

public class AccessModifiers {

   // public ==> visible everywhere
    // If Access modifier is public we can use it anywhere in project.For example day0,day10,day40
    //Public means open the world. It accessible in everywhere.
    //For example in same package or out side of package in same project.

    public static int publicVariable = 100;
    public static void publicMethod() {
        System.out.println("Public Method");
    }

    //default
    //Visible within in the same package only
    // default variable accessible in same package.
    // if not declared public,private or protected before the specifier it is a default Access modifier.
    static int defaultVariable = 200;
    static void defaultMethod() {
        System.out.println("Default Method");


    }

    //Private
    // Only visible in same class. It can not be visible out side of the class.
    private static int privateVariable = 1234565;
    private static void privateMethod(){
        System.out.println("Private Method");
    }

    public static void main(String[] args) {

        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);

        publicMethod();
        publicMethod();
        defaultMethod();
    }




}




