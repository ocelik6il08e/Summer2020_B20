package day46_ConstructorCalls;

public class ConstructorCall1 {

    public ConstructorCall1(){
        method1();
        method2();
        method3();

    }

    public static void method1(){
            method1();
       // ConstructorCall(); it doesn't call a constructor method call.
       // method3(); Static method doesn't calls a instance method.
    }

    public static void method2(){
        method2();
        // method3(); Static method doesn't calls a instance method.
       // ConstructorCall(); it doesn't call a constructor method call.
    }
    public void method3(){
        method2();
        method1();
      //  ConstructorCall(); it doesn't call a constructor method call.


    }
}
