package day18_ForLoop;

public class Emaildomain {
    public static void main(String[] args) {

        String email = "jack@hotmail.com";

        int index1 = email.indexOf('@');
        int index2 = email.indexOf(".");

        System.out.println(index1);
        System.out.println(index2);

        System.out.println("domain is :"+email.substring(index1+1,index2));
    }
}
