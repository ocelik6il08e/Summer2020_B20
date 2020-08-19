package day43_Static;

public class studentObject {

    public static void main(String[] args) {

        CyberTekStudent obj1 = new CyberTekStudent();
        obj1.studentName = "Onur";

        CyberTekStudent obj2 = new CyberTekStudent();
        obj2.studentName = "Vildan";

        System.out.println(obj1.studentName);// It is Instance variable and each instance object has unique variable.
        System.out.println(obj2.studentName);// It is Instance variable and each instance object has unique variable.

        System.out.println("=================");

        System.out.println(obj1.schoolName); // It is Static variable and each static object has command(same) variable.
        System.out.println(obj2.schoolName); // It is static variable and each instance object has command(same) variable.

    }

    public void getInfo(){ ;
    }


}
