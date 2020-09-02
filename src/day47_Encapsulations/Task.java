package day47_Encapsulations;

public class Task {


    public String name;
    public int age;
    private String userName;
    private String passWord;
    public static String companyName;

    static {
        companyName = "FaceBook";
    }

    public Task(String name, int age) {
        this.name = name;
        this.age = age;

    }

   /* public String ToString(){
        return "Name : "+ name + " Age : "+age;
    }

    */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
