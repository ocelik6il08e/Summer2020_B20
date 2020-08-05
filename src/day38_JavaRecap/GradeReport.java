package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(81,82,59,61,58,66,100,90,85,75,55,45,73,73,35,47,60,87,77,67,57,47,93,83,73,63,53,43));
        System.out.println(list);

        System.out.println("======================================");
        ArrayList<Integer> gradeA = new ArrayList<>();
        gradeA.addAll(list);
        gradeA.removeIf(each -> each < 90);
        System.out.println("Grade A : "+gradeA);
        System.out.println(gradeA.size() + " students made A");

        System.out.println("======================================");
        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf(each -> each < 80 || each > 89 );
        System.out.println("Grade B : "+gradeB);
        System.out.println(gradeB.size() + " students made B");

        System.out.println("======================================");
        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(each -> each < 70 || each > 79);
        System.out.println("Grade C : "+gradeC);
        System.out.println(gradeC.size() + " students made C");

        System.out.println("======================================");
        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(each -> each < 60 || each > 69);
        System.out.println("Grade D : "+gradeD);
        System.out.println(gradeD.size() + " students made D");

        System.out.println("======================================");
        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf(each -> each > 59 );
        System.out.println("Grade F : "+gradeF);
        System.out.println(gradeF.size() + " students Failed");






    }
}
