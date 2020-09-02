package Library;
import day47_Encapsulations.AccessModifiers;
public class Test_AccessModifiers {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

       // System.out.println(AccessModifiers.defaultVariable);// Default Modifier variable is not accessible outside the package
       // AccessModifiers.defaultMethod();// Default Modifier method is not accessible outside the package

    }
}
