package day10_ifStatements;

public class Grade {

    public static void main(String[] args) {

        int score = 49;
        String grade = "";

        if (score >= 90 && score <= 100) {
            //System.out.println("The student's final grade is A.");
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            // System.out.println("The student's final grade is B.");
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            // System.out.println("The student's final grade is C.");
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            // System.out.println("The student's final grade is D.");
            grade = "D";
        } else {
            // System.out.println("The student's final grade is F.");
            grade = "F";

        }
        System.out.println("The student's final grade is : " + grade);
    }
}
