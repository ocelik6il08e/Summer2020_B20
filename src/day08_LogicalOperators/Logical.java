package day08_LogicalOperators;

public class Logical {

    public static void main(String[] args) {
        // !: opposite boolean

        boolean r1 = 9 > 7 ; // true
        boolean r2 = ! r1; // false

        System.out.println(r1 + " : "+r2);

        boolean r3 = !false == true;
        System.out.println(r3);
    }
}
