package day24_Arrays;
import java.util.Arrays;
public class Arrays_Utility {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(arr); // Output : [I@1b6d3586 ==> HashCode

        System.out.println(Arrays.toString(arr)); // [1, 2, 3]

        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        String [] names = {"Muhtar","Jack","Henry","William","Zeyn","PerihanAbla"};
        System.out.println(names); //Output : [Ljava.lang.String;@4554617c
        System.out.println(Arrays.toString(names));

        System.out.println("================================");


        int[] nums = {5,10,6,921,3,17,40,56,8};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Maximum Number is: "+nums[nums.length-1]);
        System.out.println("Minimum Number is: "+nums[0]);
        System.out.println("===============================================");
        String students[] = {"Mehmet","Ekrem","Zeki","Tahsin"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("===============================================");

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
        int arr3[] = {3,4,5,1,2};

        System.out.println(Arrays.equals(arr1,arr2)); // True
                                                        // because equals checks index by index
        System.out.println(Arrays.equals(arr2,arr3)); // False

        System.out.println("===============================================");

        Arrays.sort(arr2);
        Arrays.sort(arr3);
        System.out.println(Arrays.equals(arr2,arr3)); // True
        System.out.println("===============================================");

        int arr4[] = {1,2,3,4};
        int arr5[] = {1,2,3,4,5};

        System.out.println(Arrays.equals(arr4,arr5)); // False
        System.out.println("===============================================");
    }
}
