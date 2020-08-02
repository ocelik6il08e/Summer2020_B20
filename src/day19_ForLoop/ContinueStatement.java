package day19_ForLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i =1; i <= 5; i++){
            if(i==3){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("===============================");

        for(char ch = 'A'; ch <= 'F'; ch++){

            if(ch == 'A' || ch == 'F'){
                continue;
            }
            System.out.print(ch +" ");
        }



    }
}
