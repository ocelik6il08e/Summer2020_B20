package day23_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {


        String[] studentNames = {"Ali","Jack","Eric","Bob","Mike"};

        String name1 = studentNames[1];
        String nameLast = studentNames[2];

        System.out.println(studentNames[0] + " and " + studentNames[studentNames.length-1]);


        System.out.println("===============================");

        int[] scores = {85,70,95,90,100};
        String[] names = {"Mike","Adam","Tonny","John","Amy"};

        System.out.println("\n1.way : Hard Way;============================================");
        System.out.println(names[0] +":"+scores[0]);
        System.out.println(names[1] +":"+scores[1]);
        System.out.println(names[2] +":"+scores[2]);
        System.out.println(names[3] +":"+scores[3]);
        System.out.println(names[4] +":"+scores[4]);
        System.out.println("\n2.Way : Prefer and Easy Way;============================================");

        for (int i = 0; i <= 4; i++) {
            System.out.println(names[i] +":"+scores[i]);

        }
        System.out.println("===============================================");

        String[] classMates = new String[5]; // == > size is 5,
        classMates[0] = "Fatih";
        classMates[2] = "Onur";
        classMates[1] = "Ali";
        classMates[3] = "Jimmy";
        classMates[4] = "Hillary";
        // classMates[5] = "Henry"; ==> you can not add element more than fixed size of array.Fixed size is 5 for classMates.

        for (int i = 0; i < 5; i++) {


            System.out.println(classMates[i]);

        }



    }
}
