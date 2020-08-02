package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();

        list.addAll(Arrays.asList('A', 'A', 'B', 'B', 'C', 'C'));

        System.out.println(list);

        ArrayList<Character> listNonDup = new ArrayList<>();

        for (Character each : list) {

            if (!listNonDup.contains(each)) {
                listNonDup.add(each);
            }

        }
        System.out.println(listNonDup);
    }
}
