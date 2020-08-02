package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practice {

    public static void main(String[] args) {

        ArrayList<Integer> listOne = new ArrayList<>();

        listOne.add(30);
        listOne.add(20);
        listOne.add(40);
        listOne.add(50);
        listOne.add(15);

        Collections.sort(listOne);
        System.out.println(listOne);

        ArrayList<Integer> descendingList = new ArrayList<>();


        for (int i = listOne.size()-1; i >= 0; i--) {
           // System.out.print(listOne.get(i) + " ");

            descendingList.add(listOne.get(i));


        }
        System.out.println(descendingList);
        }

}
