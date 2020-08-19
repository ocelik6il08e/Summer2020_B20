package day39_CustomClass.Dog;

public class DogObjects {

    public static void main(String[] args) {


        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();


        dog1.setDogInfo("Jay","Pit Bull","Large",4,"Black");
        dog2.setDogInfo("Eyo","Husky","Medium",3,"Gray");
        dog3.setDogInfo("Tr-jo","Golden Retriever","Large",4,"Brown");


        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();


    }


}
