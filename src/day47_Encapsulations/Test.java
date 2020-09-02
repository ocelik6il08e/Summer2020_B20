package day47_Encapsulations;

public class Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable); // public -Access Modifier- variable use in same package
        AccessModifiers.publicMethod();// public -Access Modifier- method use in same package

        System.out.println("=====================================================");

        System.out.println(AccessModifiers.defaultVariable);// Default Modifier  variable use in same package
        AccessModifiers.defaultMethod();// Default Modifier  method use in same package

        System.out.println("=====================================================");
        // System.out.println(AccessModifiers.privateVariable); ==> Private is not visible outside the class
        // AccessModifiers.privateMethod(); ==> Private is not visible outside the class

        Encapsulation obj1 = new Encapsulation();


    }
}
