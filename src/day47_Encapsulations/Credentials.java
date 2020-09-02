package day47_Encapsulations;

public class Credentials {

    public static void main(String[] args) {


        Task obj = new Task("Jackson",35);

        obj.setUserName("Jackson2020");
        obj.setPassWord("JS2020");

        System.out.println(obj.getPassWord());
        System.out.println(obj.getUserName());
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.companyName);



    }


}
