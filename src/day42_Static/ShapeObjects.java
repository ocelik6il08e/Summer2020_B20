package day42_Static;

public class ShapeObjects {

    public static void main(String[] args) {

        // r= 25;
        Circle c1 = new Circle();

        c1.setInfo(25);
        System.out.println(c1.calcArea());

        System.out.println("============================================");
        Circle c2 = new Circle();
        c2.setInfo(13);

        System.out.println("============================================");
        Circle c3 = new Circle();
        c3.setInfo(13);
    }
}
