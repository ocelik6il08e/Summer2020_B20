package day35_ArrayList;

import java.util.ArrayList;

public class ReverseOrder {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(3, 4);
        list.add(4, 5);
        System.out.println(list);

        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i) + ", ");

        }



    }
}
