package day46_ConstructorCalls;

public class CallsCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes");
        System.out.println(car1);
        System.out.println("==============================");
        Car car2 = new Car("Mercedes","AMG");
        System.out.println(car2);
        System.out.println("==============================");
        Car car3 = new Car("Mercedes","AMG","Black");
        System.out.println(car3);
        System.out.println("==============================");
        Car car4 = new Car("Mercedes","AMG","Black",2020);
        System.out.println(car4);
        System.out.println("==============================");
        Car car5 = new Car("Mercedes","AMG","Black",2020,72_500);
        System.out.println(car5);
        System.out.println("==============================");
    }
}
