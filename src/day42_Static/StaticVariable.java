package day42_Static;


class Test {

    int a;
    static int b;

}

public class StaticVariable {

    public static void main(String[] args) {

        Test obj1 = new Test();
        obj1.a = 5;
        obj1.b = 20;
        Test obj2 = new Test();



        System.out.println(obj1.a);
        System.out.println(obj2.a);
        System.out.println("=====================================");

        System.out.println(obj1.b);
        System.out.println(obj2.b);

    }

}
