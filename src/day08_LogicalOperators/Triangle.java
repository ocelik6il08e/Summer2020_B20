package day08_LogicalOperators;

public class Triangle {
    public static void main(String[] args) {

        double angle1 = 100;
        double angle2 = 60;
        double angle3 = 21;

        boolean triangles = angle1 + angle2 +angle3 == 180;

        if(triangles == true){
            System.out.println("It is VALID trainagle.");
        }
        if(triangles == false){
            System.out.println("It is INVALID traingle.");
        }


    }
}
