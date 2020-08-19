package day43_Static;

public class Static_vs_Instance {

    static int staticVariable; // 1 copy
    int instanceVariable; // 2 copies

    public static void main(String[] args) {

        Static_vs_Instance obj1 = new Static_vs_Instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;


        Static_vs_Instance obj2 = new Static_vs_Instance();
        //obj2.instanceVariable = 300;
        System.out.println(obj1.instanceVariable); // it will be 100 because each objects has own copy.
        System.out.println(obj2.instanceVariable); // it will be 0 because each objects has own copy.


        System.out.println("==========================================================================");

        System.out.println(obj1.staticVariable); // it will be 500.
        System.out.println(obj2.staticVariable); // it will be 500 because static variable has only one copy.


    }
}
