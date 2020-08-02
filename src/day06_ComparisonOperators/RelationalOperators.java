package day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >

        boolean r1 = 10 > 9;
        System.out.println(r1);
        // <
        boolean r2 = 100 < 9000;
        System.out.println(r2);

        // >= : Greater than or equal

        boolean r3 = 87 >= 85;
        System.out.println(r3);
        boolean r4 = 100 >= 100;
        System.out.println(r4);

        // <= :less than or equal

        boolean r5 = 200 <= 300;
        System.out.println(r5);

        // == : equal

        boolean r6 = 900 == 800;
        System.out.println(r6);

        boolean r7 = true == false;
        System.out.println(r7);

        boolean r8 = "Muhtar" == "MUHTAR"; // Those are different characters because Java is case sensetive lanquage.
        System.out.println(r8);
        boolean r9 = "Muhtar" == "Muhtar"; // Those are same characters.
        System.out.println(r9);

        // != : not equal





    }
}

