package day50_Inheritance_Overriding;

public class Test extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println(Test.publicData);
        System.out.println(Test.protectedData);
        System.out.println(Test.defaultDate);
       //  System.out.println(Test.privateData); It is not visible because private data only visible own class.
    }
}
