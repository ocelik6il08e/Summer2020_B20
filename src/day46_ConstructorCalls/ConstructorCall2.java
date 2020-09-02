package day46_ConstructorCalls;

public class ConstructorCall2 {

    public ConstructorCall2() {

        System.out.println("A");

    }

    public ConstructorCall2(int a) {
        this();// calling default constructor
        System.out.println("B");
    }

    public ConstructorCall2(String str) {
        this(10);
        System.out.println("C");
    }

    public ConstructorCall2(char a){
        this();
        System.out.println("D");
    }

    public static void main(String[] args) {

        new ConstructorCall2('C');
    }
}
