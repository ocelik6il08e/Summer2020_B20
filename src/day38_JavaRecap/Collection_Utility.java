package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
    /*
        Collections Class:
        Collections.sort()
        Collections.swap()
        Collections.frequency()

        Collections.max()
        Collections.min()
        Collections.replaceAll()

        Those methods are static methods.


     */

    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R','V','A','Z','M','U','D','N','B'));

        System.out.println(chars);
        System.out.println("==========sort Method============");
        Collections.sort(chars);
        System.out.println(chars);
        System.out.println("===========swap Method=================");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Aslan","Christina","Zeliha","Iman","Fatma","Muharrem"));
        //Collections.swap(students,1,5); // 1. way
        Collections.swap(students,students.indexOf("Christina"),students.indexOf("Muharrem")); //2.way

        System.out.println(students);

        System.out.println("==========frequency method =========");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Coffe","Coffe","Tea","Egg","Battery","Battery","Battery","Battery"));
        int count = Collections.frequency(items,"Battery");
        System.out.println(count);
        System.out.println("================find Unique Element=====================");

        ArrayList<String> unique = new ArrayList<>();
        int count1 = 0;
        for(String each : items){
           int i = Collections.frequency(items,each);
           if(i == 1){
               unique.add(each);
            }
        }
        System.out.println(unique);
        System.out.println("=================Second way find Unique Element===========");

        ArrayList<String> unique2 = new ArrayList<>();
        unique2.addAll(items);
        unique2.removeIf(p -> Collections.frequency(unique2,p) > 1);
        System.out.println(unique2);

        System.out.println("====================== Max and Min ============================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(125,639,45,-1002,96,-3,-789,125,4565,63,87,63));

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("Max is :" + max );
        System.out.println("Min is :"+ min  );

        Collections.replaceAll(list,125,10125);

        System.out.println(list);

    }
}
