package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,8,9));

        Predicate<Integer> lessThan5 = p -> p < 5; // 1.way
        list.removeIf(lessThan5);
        System.out.println(list);

        list.removeIf(p -> p <5); // 2.way
        System.out.println(list);


        System.out.println("=======================================");

        Predicate<Integer> oddNumbers = p -> p % 2 != 0;
        ArrayList<Integer>numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);

        }
        System.out.println(numbers);
        System.out.println("====================================");
        numbers.removeIf(oddNumbers);
        System.out.println(numbers);
        System.out.println("=====================================");
        numbers.removeIf(p -> p %2 == 0);;
        System.out.println(numbers);
        System.out.println("===============================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ali","Marry", "Veli", "Ahmed", "Mehmed", "Turan", "Ahmed", "Suat","Murat"));

        names.removeIf(each -> each.startsWith("M") && each.endsWith("y"));
        System.out.println(names);


        System.out.println("Task :=======================================================");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,5,6,7,8,8,9));

        nums.removeIf(p -> Collections.frequency(nums ,p) != 1);
        System.out.println(nums);








    }
}


